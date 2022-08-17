/*
ÁREA

QUESTÃO
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

ENTRADA
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

SAÍDA
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima,
sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.

*/

var input = require ('fs').readFileSync('./in.txt', 'utf-8');
var lines = input.split('\n')

const PI = 3.14159
const DIVMULTI = 2

var valores = lines.shift().split(" ")

var areaDoTriangulo = (valores[0] * valores[2]) / DIVMULTI;
var areaDoCirculo = PI * Math.pow(valores[2], DIVMULTI);
var areaDoTrapezio = ((Number(valores[0]) + Number(valores[1])) * valores[2]) / DIVMULTI;
var areaDoQuadrado = Math.pow(valores[1], DIVMULTI);
var areaDoRetangulo = valores[0] * valores[1];

[
`TRIANGULO: ${areaDoTriangulo.toFixed(3)}`, 
`CIRCULO: ${areaDoCirculo.toFixed(3)}`, 
`TRAPEZIO: ${areaDoTrapezio.toFixed(3)}`, 
`QUADRADO: ${areaDoQuadrado.toFixed(3)}`, 
`RETANGULO: ${areaDoRetangulo.toFixed(3)}`, 
].map((areas) => (console.log(areas)))