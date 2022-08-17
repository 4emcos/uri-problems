'''
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
'''
notas = [100, 50, 20, 10, 5, 2, 1]
notasCount = 0
notasText = ["nota(s) de R$ 100.00", "nota(s) de R$ 50.00", "nota(s) de R$ 20.00",
             "nota(s) de R$ 10.00", "nota(s) de R$ 5.00", "nota(s) de R$ 2.00", 'moeda(s) de R$ 1.00']

moedasText = ["moeda(s) de R$ 0.50", "moeda(s) de R$ 0.25",
              "moeda(s) de R$ 0.10", "moeda(s) de R$ 0.05", "moeda(s) de R$ 0.01"]
moedas = [1, 50, 25, 10, 5, 1]
moedasCount = 0


valor = float(input())
goInt = (valor * 100) % 100


for i in notas:
    newValor = valor % i
    qtdNotas = (valor - newValor)/i
    valor = newValor
    print("NOTAS:") if notasCount == 0 else ''
    if i == 1:
        moedasText.insert(0, "%d %s" % (qtdNotas, notasText[notasCount]))
    else:
        print("%d %s" % (qtdNotas, notasText[notasCount]))
    notasCount += 1

for j in moedas:
    if moedasCount == 0:
        print("MOEDAS:")
        print(moedasText[moedasCount])
    else:
        newMoeda = goInt % j
        qtdMoedas = (goInt - newMoeda)/j
        goInt = newMoeda
        print("%d %s" % (qtdMoedas, moedasText[moedasCount]))
    moedasCount += 1
