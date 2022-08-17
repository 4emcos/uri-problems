/*
O MAIOR 

QUESTÃO
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

ENTRADA
O arquivo de entrada contém três valores inteiros.

SAÍDA
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
*/

var input = require ('fs').readFileSync('./in.txt', 'utf-8');
var lines = input.split('\n')

var numeros = lines.shift().split(' ');

for (let i = 0; i < numeros.length + 2; i++) {
    Number(numeros[i])
    if(i > numeros.length){
        numeros.sort((a , b) => a - b )
        console.log(`${numeros[numeros.length-1]} eh o maior`)
    }
}