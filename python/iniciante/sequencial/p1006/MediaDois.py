'''
MÉDIA 2

QUESTÃO
Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. 
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem 
peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre
com uma casa decimal.

ENTRADA
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

SAÍDA
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito
após o ponto decimal e com um espaço em branco antes e depois da igualdade. Assim como 
todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso 
contrário, você receberá "Presentation Error".

'''

PESO_NOTA_A = 2
PESO_NOTA_B = 3
PESO_NOTA_C = 5

valorA = float(input())
valorB = float(input())
valorC = float(input())

media = ((valorA * PESO_NOTA_A) + (valorB * PESO_NOTA_B) + (valorC * PESO_NOTA_C)) / (PESO_NOTA_A + PESO_NOTA_B + PESO_NOTA_C)

print ("MEDIA = %.1f" %media)