package iniciante.sequencial.p1012;
/*
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

*/

import java.util.Scanner;

public class Area {

    public static final int DIVMULTI = 2;
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String valores[] = new String[3];
        valores = in.nextLine().split(" ");

        double a = Double.parseDouble(valores[0]);
        double b = Double.parseDouble(valores[1]);
        double c = Double.parseDouble(valores[2]);

        double areaDoTriangulo = (a * c) / DIVMULTI;
        double areaDoCirculo = PI * Math.pow(c, DIVMULTI);
        double areaDoTrapezio = ((a + b) * c) / DIVMULTI;
        double areaDoQuadrado = Math.pow(b, DIVMULTI);
        double areaDoRetangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n", areaDoTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaDoCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaDoTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaDoQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaDoRetangulo);

        in.close();

    }
}
