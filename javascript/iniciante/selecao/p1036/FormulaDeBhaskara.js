/* 
FORMULA DE BHASKARA

QUESTÃO
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

ENTRADA
Leia três valores de ponto flutuante (double) A, B e C.

SAÍDA
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
*/

var input = require("fs").readFileSync("./in.txt", "utf8");
var lines = input.split("\n");

const values = lines.shift().split(" ");
const a = parseFloat(values[0]);
const b = parseFloat(values[1]);
const c = parseFloat(values[2]);

const delta = b ** 2 - 4 * a * c;

if (delta < 0 || a === 0) {
  console.log("Impossivel calcular");
} else {
  const x1 = (-b + Math.sqrt(delta)) / (2 * a);
  const x2 = (-b - Math.sqrt(delta)) / (2 * a);
  console.log(`R1 = ${x1.toFixed(5)}`);
  console.log(`R2 = ${x2.toFixed(5)}`);
}
