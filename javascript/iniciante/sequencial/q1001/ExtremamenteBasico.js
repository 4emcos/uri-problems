var input = require('fs').readFileSync('./in.txt', 'utf8');
var lines = input.split('\n');

var a = parseInt(lines.shift()); 
var b = parseInt(lines.shift());

console.log('X = ' + (a+b));