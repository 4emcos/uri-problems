package iniciante.selecao.p1036;
/* 
FORMULA DE BHASKARA

QUESTÃO
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

ENTRADA
Leia três valores de ponto flutuante (double) A, B e C.

SAÍDA
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
*/

import java.util.Scanner;

public class FormulaDeBhaskara {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] valores = in.nextLine().split(" ");

        double A = Double.parseDouble(valores[0]);
        double B = Double.parseDouble(valores[1]);
        double C = Double.parseDouble(valores[2]);

        double delta = Math.pow(B, 2) - 4 * A * C;
        if (delta < 0 || A == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double raizDelta = Math.sqrt(delta);
            double raiz1 = (-B + raizDelta) / (2 * A);
            double raiz2 = (-B - raizDelta) / (2 * A);
            System.out.printf("R1 = %.5f\nR2 = %.5f\n", raiz1, raiz2);
        }

        in.close();
    }
}
