/*
NOTAS E MOEDAS

QUESTÃO
Leia um valor de ponto flutuante com duas casas decimais. 
Este valor representa um valor monetário. A seguir, calcule o 
menor número de notas e moedas possíveis no qual o valor
 pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. 
 As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir
  mostre a relação de notas necessárias.
image.png
ENTRADA
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

SAÍDA
Imprima a quantidade mínima de notas e moedas necessárias para trocar o 
    valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.

*/

const input = require("fs").readFileSync("./in.txt", "utf-8");
const lines = input.split("\n");

const NOTAS = [100, 50, 20, 10, 5, 2, 1];
let NOTAS_COUNT = 0;
let NOTAS_TEXT = [
  "nota(s) de R$ 100.00",
  "nota(s) de R$ 50.00",
  "nota(s) de R$ 20.00",
  "nota(s) de R$ 10.00",
  "nota(s) de R$ 5.00",
  "nota(s) de R$ 2.00",
  "moeda(s) de R$ 1.00",
];

const MOEDAS = [1, 50, 25, 10, 5, 1];
let MOEDAS_COUNT = 0;
let MOEDAS_TEXT = [
  "moeda(s) de R$ 0.50",
  "moeda(s) de R$ 0.25",
  "moeda(s) de R$ 0.10",
  "moeda(s) de R$ 0.05",
  "moeda(s) de R$ 0.01",
];

let valor = parseFloat(lines.shift());
let goInt = (valor * 100) % 100;

for (const i of NOTAS) {
  let newValor = valor % i;
  let qtdNotas = (valor - newValor) / i;
  valor = newValor;
  NOTAS_COUNT == 0 ? console.log("NOTAS:") : "";
  i == 1
    ? MOEDAS_TEXT.unshift(`${qtdNotas} ${NOTAS_TEXT[NOTAS_COUNT]}`)
    : console.log(`${qtdNotas} ${NOTAS_TEXT[NOTAS_COUNT]}`);

  NOTAS_COUNT++;
}

for (const j of MOEDAS) {
  if (MOEDAS_COUNT == 0) {
    console.log("MOEDAS:");
    console.log(MOEDAS_TEXT[MOEDAS_COUNT]);
  } else {
    let newMoeda = goInt % j;
    let qtdMoedas = (goInt - newMoeda) / j;
    goInt = newMoeda;
    console.log(`${qtdMoedas} ${MOEDAS_TEXT[MOEDAS_COUNT]}`);
  }
  MOEDAS_COUNT++;
}
