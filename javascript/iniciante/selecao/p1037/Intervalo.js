/*
INTERVALO

QUESTÃO
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

ENTRADA
O arquivo de entrada contém um número com ponto flutuante qualquer.

SAÍDA
A saída deve ser uma mensagem conforme exemplo abaixo.

*/

var input = require("fs").readFileSync("./in.txt", "utf8");
var lines = input.split("\n");

const intervalos = [
  [0, 25],
  [25, 50],
  [50, 75],
  [75, 100],
];
let founded = false;
const value = parseFloat(lines.shift());

for (const i of intervalos) {
  if (value >= i[0] && value <= i[1]) {
    founded = true;
    if (i[0] === 0) {
      console.log(`Intervalo [${i[0]},${i[1]}]`);
    } else {
      console.log(`Intervalo (${i[0]},${i[1]}]`);
    }

    break;
  }
}

founded === false ? console.log("Fora de intervalo") : "";
