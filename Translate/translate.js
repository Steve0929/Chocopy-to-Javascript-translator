//please run npm i readline-sync if you havent
var readlineSync = require('readline-sync');
var name = null 
console.log("enter your name");
name = readlineSync.question()
console.log("hello " + name);