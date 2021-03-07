var input = require('fs').readFileSync('./in.txt', 'utf8');
var lines = input.split('\n');

const pi = 3.14159;
const multiplicador = 2;

var raio = parseFloat(lines.shift());
var area = pi * (raio**multiplicador)

console.log(`A=${area.toFixed(4)}`)