const sayName = (name) => {
    console.log(`hello ${name}`);
}

function print(from, to){
    let timer = setTimeout(function tick(){
        if(from<=to){
            console.log(from);
            from++;
            timer = setTimeout(tick, 500);
        } else {
            clearTimeout(timer);
        }
    }, 500);
}

print(1, 10);