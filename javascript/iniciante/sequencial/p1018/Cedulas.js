/*
Cédulas

QUESTÃO
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas)
no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1.
 A seguir mostre o valor lido e a relação de notas necessárias.

ENTRADA
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

SAÍDA
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias,
 conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha,
  caso contrário seu programa apresentará a mensagem: “Presentation Error”.
*/

var input = require ('fs').readFileSync('./in.txt', 'utf-8');
var lines = input.split('\n')

var valor = parseInt(lines.shift())

var notasDeCem = 0;
var notasDeCiquenta = 0;
var notasDeVinte = 0;
var notasDeDez = 0;
var notasDeCinco = 0;
var notasDeDois = 0;
var notasDeUm = 0;
var manegementValor = valor;

while (manegementValor !== 0 && manegementValor >= 0) {

  if (manegementValor - 100 >= 0){
    notasDeCem += 1;
    manegementValor = manegementValor - 100;
  }
  else if (manegementValor - 50 >= 0) {
      notasDeCiquenta += 1;
      manegementValor = manegementValor - 50;
  }
  else if (manegementValor - 20 >= 0) {
      notasDeVinte += 1;
      manegementValor = manegementValor - 20;
  }
  else if (manegementValor - 10 >= 0) {
      notasDeDez += 1;
      manegementValor = manegementValor - 10;
  }
  else if (manegementValor - 5 >= 0) {
      notasDeCinco += 1;
      manegementValor = manegementValor - 5;
  }
  else if (manegementValor - 2 >= 0) {
      notasDeDois += 1;
      manegementValor = manegementValor - 2;
  }
  else if (manegementValor - 1 >= 0) {
      notasDeUm += 1;
      manegementValor = manegementValor - 1;
  }
  
}

[valor,
`${notasDeCem} nota(s) de R$ 100,00`,
`${notasDeCiquenta} nota(s) de R$ 50,00`,
`${notasDeVinte} nota(s) de R$ 20,00`,
`${notasDeDez} nota(s) de R$ 10,00`,
`${notasDeCinco} nota(s) de R$ 5,00`,
`${notasDeDois} nota(s) de R$ 2,00`, 
`${notasDeUm} nota(s) de R$ 1,00`
].map((valores) => (console.log(valores)))