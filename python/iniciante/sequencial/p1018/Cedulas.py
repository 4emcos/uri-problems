'''
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
'''

valor = int(input())

notasDeCem = 0
notasDeCiquenta = 0
notasDeVinte = 0
notasDeDez = 0
notasDeCinco = 0
notasDeDois = 0
notasDeUm = 0
manegementValor = valor


while (manegementValor != 0 and manegementValor >= 0):

  if (manegementValor - 100 >= 0):
      notasDeCem += 1
      manegementValor = manegementValor - 100
  
  elif (manegementValor - 50 >= 0):
      notasDeCiquenta += 1
      manegementValor = manegementValor - 50
  
  elif (manegementValor - 20 >= 0):
      notasDeVinte += 1
      manegementValor = manegementValor - 20
  
  elif (manegementValor - 10 >= 0):
      notasDeDez += 1
      manegementValor = manegementValor - 10
  
  elif (manegementValor - 5 >= 0):
      notasDeCinco += 1
      manegementValor = manegementValor - 5
  
  elif (manegementValor - 2 >= 0):
      notasDeDois += 1
      manegementValor = manegementValor - 2
  
  elif (manegementValor - 1 >= 0):
      notasDeUm += 1
      manegementValor = manegementValor - 1
  
  
print(valor);
print("%d nota(s) de R$ 100,00" %notasDeCem)
print("%d nota(s) de R$ 50,00" %notasDeCiquenta)
print("%d nota(s) de R$ 20,00" %notasDeVinte)
print("%d nota(s) de R$ 10,00" %notasDeDez)
print("%d nota(s) de R$ 5,00" %notasDeCinco)
print("%d nota(s) de R$ 2,00" %notasDeDois)
print("%d nota(s) de R$ 1,00" %notasDeUm)