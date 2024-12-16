// const os = require('os');

// console.log(os.platform()); //win32
// console.log(os.arch()); //'x64'
// console.log(os.type()); // 'Windows_NT'
// console.log(os.release()); // '10.0.19045'
// console.log(`System Uptime: ${os.uptime()} seconds`);
// console.log(`Total Memory: ${os.totalmem()} bytes`);
// console.log(`Free Memory: ${os.freemem()} bytes`);

// // console.log(os.cpus());
// console.log(os.userInfo());

const EventEmitter = require("events");
class MyEmitter extends EventEmitter {
  startTicks() {
    setInterval(() => {
      this.emit("tick");
    }, 1000);
  }
}
var ticker = new MyEmitter();

ticker.on("tick", function () {
  console.log("tick event fired");
});
ticker.startTicks();
