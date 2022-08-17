'''
Distância Entre Dois Pontos

QUESTÃO
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = sqrt((x2 - x1)^2 + (y2 - y1)^2)

ENTRADA
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

SAÍDA
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
'''
import math

p1 = [float(x) for x in input().split(' ')]
p2 = [float(x) for x in input().split(' ')]

distancia = math.sqrt(math.pow((p2[0] - p1[0]), 2) + math.pow((p2[1] - p1[1]), 2))

print('%.4f' %distancia)    
