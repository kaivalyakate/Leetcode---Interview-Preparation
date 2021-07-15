function sum(...a){
    let sum = 0;
    for(let x in a){
        sum += x;
    }
    return sum;
}

console.log(sum(2, 3));