const { readFile, writeFileSync } = require("fs");

readFile('./sample.txt', 'utf8', (err, result) => {
        if(err){
            console.log(err);
            return;
        }
        const first = result;
        readFile('./sample.txt', 'utf8', (err, result) => {
            const second = result;
            writeFileSync(
                `newtext.txt`,
                `Data one & two: ${first}+${second}`
            )
            readFile('./newtext.txt', 'utf8', (err, result) => {
                console.log(result);
            })
        })
    }
)