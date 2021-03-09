/*
Salário com bônus

QUESTÃO
Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.

ENTRADA
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.

SAÍDA
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.

*/


var input = require('fs').readFileSync('./in.txt' , 'utf-8')
var lines = input.split('\n')

const COMISSAO = 0.15

var nome = lines.shift();
var salario = parseFloat(lines.shift())
var vendas = parseFloat(lines.shift())

var salarioReal = (vendas * COMISSAO) + salario

console.log(`TOTAL = R$ ${salarioReal.toFixed(2)}`)
