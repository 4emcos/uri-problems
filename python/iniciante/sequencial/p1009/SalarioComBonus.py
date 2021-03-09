'''
Salário com bônus

QUESTÃO
Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.

ENTRADA
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.

SAÍDA
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.

'''

COMISSAO = 0.15

nome = str(input())
salario = float(input())
vendas = float(input())

salarioReal = (vendas * COMISSAO) + salario

print("TOTAL = R$ %.2f" %salarioReal)