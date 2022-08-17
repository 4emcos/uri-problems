'''

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

'''

intervalos = [[0, 25], [25, 50], [50, 75], [75, 100]]

valores = float(input())
founded = False

for intervalo in intervalos:
    if intervalo[0] <= valores <= intervalo[1]:
        founded = True
        if intervalo[0] == 0:
            print('Intervalo [{},{}]'.format(intervalo[0], intervalo[1]))
        else:
            print('Intervalo ({},{}]'.format(intervalo[0], intervalo[1]))
        break

if not founded:
    print('Fora de intervalo')
