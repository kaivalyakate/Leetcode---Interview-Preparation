const { readFileSync, writeFileSync} = require("fs");

writeFileSync(
    './sample.txt',
    "Hey Brother",
   // {flag: "a"}
)

const first = readFileSync("./sample.txt", "utf8");
console.log(first);