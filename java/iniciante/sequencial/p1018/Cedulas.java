package iniciante.sequencial.p1018;
/*
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
*/

import java.util.Scanner;

public class Cedulas {

    public static final int NOTA_DE_CEM =  100;    
    public static final int NOTA_DE_CINQUENTA =  50;    
    public static final int NOTA_DE_VINTE =  20;
    public static final int NOTA_DE_DEZ =  10;
    public static final int NOTA_DE_CINCO =  5;
    public static final int NOTA_DE_DOIS =  2;
    public static final int NOTA_DE_UM =  1;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    
        int valor = in.nextInt();
        int notasDeCem = 0;
        int notasDeCiquenta = 0;
        int notasDeVinte = 0;
        int notasDeDez = 0;
        int notasDeCinco = 0;
        int notasDeDois = 0;
        int notasDeUm = 0;
        int manegementValor = valor;
        in.close();

        while (manegementValor != 0 && manegementValor >= 0) {
            
            if (manegementValor - NOTA_DE_CEM >= 0){
                notasDeCem += 1;
                manegementValor = manegementValor - NOTA_DE_CEM;
            }
            else if (manegementValor - NOTA_DE_CINQUENTA >= 0) {
                notasDeCiquenta += 1;
                manegementValor = manegementValor - NOTA_DE_CINQUENTA;
            }
            else if (manegementValor - NOTA_DE_VINTE >= 0) {
                notasDeVinte += 1;
                manegementValor = manegementValor - NOTA_DE_VINTE;
            }
            else if (manegementValor - NOTA_DE_DEZ >= 0) {
                notasDeDez += 1;
                manegementValor = manegementValor - NOTA_DE_DEZ;
            }
            else if (manegementValor - NOTA_DE_CINCO >= 0) {
                notasDeCinco += 1;
                manegementValor = manegementValor - NOTA_DE_CINCO;
            }
            else if (manegementValor - NOTA_DE_DOIS >= 0) {
                notasDeDois += 1;
                manegementValor = manegementValor - NOTA_DE_DOIS;
            }
            else if (manegementValor - NOTA_DE_UM >= 0) {
                notasDeUm += 1;
                manegementValor = manegementValor - NOTA_DE_UM;
            }

        }

        System.out.println(valor);
        System.out.printf("%d nota(s) de R$ 100,00\n", notasDeCem);
        System.out.printf("%d nota(s) de R$ 50,00\n", notasDeCiquenta);
        System.out.printf("%d nota(s) de R$ 20,00\n", notasDeVinte);
        System.out.printf("%d nota(s) de R$ 10,00\n", notasDeDez);
        System.out.printf("%d nota(s) de R$ 5,00\n", notasDeCinco);
        System.out.printf("%d nota(s) de R$ 2,00\n", notasDeDois);
        System.out.printf("%d nota(s) de R$ 1,00\n", notasDeUm);
        

    }
}
