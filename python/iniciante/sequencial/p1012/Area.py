'''
ÁREA

QUESTÃO
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

ENTRADA
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

SAÍDA
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima,
sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.

'''
PI = 3.14159
DIVMULTI = 2

inputs = input().split(' ')
valores = [float (i) for i in inputs]

areaDoTriangulo = (valores[0] * valores[2]) / DIVMULTI
areaDoCirculo = PI * valores[2] ** DIVMULTI
areaDoTrapezio = ((valores[0] + valores[1]) * valores[2]) / DIVMULTI
areaDoQuadrado = valores[1] ** DIVMULTI
areaDoRetangulo = valores[0] * valores[1]

print('TRIANGULO: %.3f' %areaDoTriangulo) 
print('CIRCULO: %.3f' %areaDoCirculo)
print('TRAPEZIO: %.3f' %areaDoTrapezio)
print('QUADRADO: %.3f' %areaDoQuadrado)
print('RETANGULO: %.3f' %areaDoRetangulo)
