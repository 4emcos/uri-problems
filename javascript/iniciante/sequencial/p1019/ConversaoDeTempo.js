
/* 
Conversão de Tempo

QUESTÃO
Leia um valor inteiro, que é o tempo de duração em segundos de um 
determinado evento em uma fábrica, e informe-o expresso no formato
horas:minutos:segundos.

ENTRADA
O arquivo de entrada contém um valor inteiro N.

SAÍDA
Imprima o tempo lido no arquivo de entrada (segundos),
 convertido para horas:minutos:segundos, conforme exemplo fornecido.

*/

var input = require ('fs').readFileSync('./in.txt', 'utf-8');
var lines = input.split('\n')

const SEGUNDO = 60;
const HORA = 3600;

var tempo = parseInt(lines.shift())

var horas = tempo / HORA
var minutos = (tempo / SEGUNDO) % SEGUNDO
var segundos = tempo % SEGUNDO

console.log(`${parseInt(horas)}:${parseInt(minutos)}:${parseInt(segundos)}`)