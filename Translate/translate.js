//please run npm i readline-sync if you havent
//Try running the code from a console if your IDE is failing to run it
var readlineSync = require('readline-sync');
var name = null 
console.log("enter your name");

name = readlineSync.question()
console.log("hello " + name);
