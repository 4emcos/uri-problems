'''
IDADE EM DIAS

QUESTÃO
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

ENTRADA
O arquivo de entrada contém um valor inteiro.

SAÍDA
Imprima a saída conforme exemplo fornecido.
'''
ANO = 365
DIA = 30

idade = int(input())

anos = idade / ANO
meses = (idade % ANO) / DIA
dias = (idade % ANO) % DIA

print("%d ano(s)" %anos)
print("%d mes(es)" %meses)
print("%d dia(s)" %dias)