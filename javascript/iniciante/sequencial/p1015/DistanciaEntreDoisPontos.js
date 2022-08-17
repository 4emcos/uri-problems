/*
Distância Entre Dois Pontos

QUESTÃO
Leia os quatro valores correspondentes aos eixos x e y de dois
pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a 
distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = sqrt((x2 - x1)^2 + (y2 - y1)^2)

ENTRADA
O arquivo de entrada contém duas linhas de dados. A primeira linha contém
dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores
de ponto flutuante x2 y2.

SAÍDA
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
*/


var input = require ('fs').readFileSync('./in.txt', 'utf-8');
var lines = input.split('\n')

var p1 = lines.shift().split(' ')
var p2 = lines.shift().split(' ')

var eixos = {
    "x1" : p1[0],
    "y1" : p1[1],
    "x2" : p2[0],
    "y2" : p2[1]
}

var distancia = Math.sqrt(Math.pow( (eixos['x2'] - eixos['x1']) , 2)  + Math.pow( (eixos["y2"] - eixos["y1"]), 2 ))

console.log(distancia.toFixed(4))