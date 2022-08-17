package iniciante.sequencial.p1013;
/*
O MAIOR 

QUESTÃO
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

ENTRADA
O arquivo de entrada contém três valores inteiros.

SAÍDA
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
*/

import java.util.Scanner;

public class OMaior {

    public static final int DIVISOR = 2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String entradas[] = new String[3];        
        int numeros[] = new int[3];
        int maiorAb = 0;

        entradas = in.nextLine().split(" ");

        for (int i = 0; i < entradas.length; i++) {
            numeros[i] = Integer.parseInt(entradas[i]);
        }

        maiorAb = (numeros[0] + numeros[1] + Math.abs(numeros[0] - numeros[1])) / DIVISOR;
        System.out.println(maiorAb > numeros[2] ? maiorAb + " eh o maior" : numeros[2] + " eh o maior");

        in.close();



        
    }
    
}
