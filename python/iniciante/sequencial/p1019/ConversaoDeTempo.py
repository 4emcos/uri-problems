'''
Conversão de Tempo

QUESTÃO
Leia um valor inteiro, que é o tempo de duração em segundos de um 
determinado evento em uma fábrica, e informe-o expresso no formato
horas:minutos:segundos.

ENTRADA
O arquivo de entrada contém um valor inteiro N.

SAÍDA
Imprima o tempo lido no arquivo de entrada (segundos),
convertido para horas:minutos:segundos, conforme exemplo fornecido.

'''
HORA = 3600
SEGUNDO = 60

tempo = int(input())

horas = tempo / HORA
minutos = (tempo / SEGUNDO) % SEGUNDO
segundos = tempo % SEGUNDO

print("%d:%d:%d" %(horas,minutos,segundos))