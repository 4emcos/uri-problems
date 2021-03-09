/*
Cálculo Simples

QUESTÃO
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 
e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

ENTRADA
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, 
respectivamente dois inteiros e um valor com 2 casas decimais.

SAÍDA
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de 
deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.

*/

var input = require('fs').readFileSync('./in.txt' , 'utf-8')
var lines = input.split('\n')
var itemA = []
var itemB = []

itemA = lines.shift().split(" ")
itemB = lines.shift().split(" ")

var valorAPagar = (itemA[1] * itemA[2]) + (itemB[1] * itemB[2])

console.log(`VALOR A PAGAR: R$ ${valorAPagar.toFixed(2)}` )
