'''
DIFERENÇA

QUESTÃO
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a 
diferença do produto de A e B pelo produto de C e D segundo a fórmula: 
DIFERENCA = (A * B - C * D).

ENTRADA
O arquivo de entrada contém 4 valores inteiros.

SAÍDA
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, 
conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
'''

valorA = int(input())
valorB = int(input())
valorC = int(input())
valorD = int(input())

diferenca = ((valorA * valorB) - (valorC * valorD))

print('DIFERENCA = %d' %diferenca) 