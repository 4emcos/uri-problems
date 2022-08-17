'''
O MAIOR 

QUESTÃO
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

ENTRADA
O arquivo de entrada contém três valores inteiros.

SAÍDA
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
'''

numeros = [int(x) for x in input().split()]
numeros.sort()
print('%d eh o maior' %numeros[-1])