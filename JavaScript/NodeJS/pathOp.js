const path = require("path");

const filepath = path.join("name","kk","modi");
console.log(path.basename(filepath));

const absolute = path.join(__dirname, "kk", 'modi');
console.log(absolute);