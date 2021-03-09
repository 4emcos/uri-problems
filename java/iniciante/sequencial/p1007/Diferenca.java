package iniciante.sequencial.p1007;

/*
DIFERENÇA

QUESTÃO
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a 
diferença do produto de A e B pelo produto de C e D segundo a fórmula: 
DIFERENCA = (A * B - C * D).

ENTRADA
O arquivo de entrada contém 4 valores inteiros.

SAÍDA
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, 
conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
*/


import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int valorA = in.nextInt();
        int valorB = in.nextInt();
        int valorC = in.nextInt();
        int valorD = in.nextInt();

        int diferenca = (valorA * valorB) - (valorC * valorD);

        System.out.println("DIFERENCA = " + diferenca);

        in.close();
        
    }
}
