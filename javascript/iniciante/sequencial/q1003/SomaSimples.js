var input = require('fs').readFileSync('./in.txt','utf-8')
var lines = input.split('\n')

var valorA = parseInt(lines.shift())
var valorB = parseInt(lines.shift())

console.log(`SOMA = ${valorA + valorB}`)