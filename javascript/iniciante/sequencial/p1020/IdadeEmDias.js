/*
IDADE EM DIAS

QUESTÃO
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

ENTRADA
O arquivo de entrada contém um valor inteiro.

SAÍDA
Imprima a saída conforme exemplo fornecido.

*/

const ANO = 365;
const DIA = 30;


var input = require ('fs').readFileSync('./in.txt', 'utf-8');
var lines = input.split('\n')

var idade = parseInt(lines.shift())

var anos = idade / ANO;
var meses = (idade % ANO) / DIA;
var dias = (idade % ANO) % DIA;

[
    `${parseInt(anos)} ano(s)`,
    `${parseInt(meses)} mes(es)`,
    `${parseInt(dias)} dia(s)`
].map( (e) => console.log(e))