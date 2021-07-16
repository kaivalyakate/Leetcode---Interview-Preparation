const sayName = require("./app");

//console.log(sayName.namePerson("Haven"));

const os = require('os');
console.log(`The System uptime is ${os.uptime()}`);

const osInfo = {
    memory: os.totalmem(),
    name: os.type(),
    freeMem: os.freemem(),
    release: os.release()
}

console.log(osInfo);