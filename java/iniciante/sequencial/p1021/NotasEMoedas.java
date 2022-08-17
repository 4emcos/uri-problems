package iniciante.sequencial.p1021;

import java.util.Scanner;

/*
NOTAS E MOEDAS

QUESTÃO
Leia um valor de ponto flutuante com duas casas decimais. 
Este valor representa um valor monetário. A seguir, calcule o 
menor número de notas e moedas possíveis no qual o valor
 pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. 
 As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir
  mostre a relação de notas necessárias.

ENTRADA
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

SAÍDA
Imprima a quantidade mínima de notas e moedas necessárias para trocar o 
    valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.

*/


public class NotasEMoedas {

    /* constantes das notas */
    public static final int NOTA_DE_CEM =  100;    
    public static final int NOTA_DE_CINQUENTA =  50;    
    public static final int NOTA_DE_VINTE =  20;
    public static final int NOTA_DE_DEZ =  10;
    public static final int NOTA_DE_CINCO =  5;
    public static final int NOTA_DE_DOIS =  2;
    public static final int NOTA_DE_UM =  1;

    /* constantes de moedas */ 
    public static final int MOEDA_DE_CINQUENTA = 50;
    public static final int MOEDA_DE_VINTE_E_CINCO = 25;
    public static final int MOEDA_DE_DEZ = 10;
    public static final int MOEDA_DE_CINCO = 5;
    public static final int MOEDA_DE_UM_CENTAVO = 1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    
        String valores[] = new String[3];
        valores = in.nextLine().split("\\.");

        int cedulas = Integer.parseInt(valores[0]);
        int moedas = Integer.parseInt(valores[1]);


        /* notas */
        int notasDeCem = 0;
        int notasDeCiquenta = 0;
        int notasDeVinte = 0;
        int notasDeDez = 0;
        int notasDeCinco = 0;
        int notasDeDois = 0;
        int notasDeUm = 0;
        /* moedas */
        int moedaDeCinquenta = 0;
        int moedaDeVinteECinco = 0;
        int moedaDeDez = 0;
        int moedaDeCinco = 0;
        int moedaDeUmCentavo = 0;
        
        in.close();

        while (cedulas != 0 && cedulas >= 0) {
            
            if (cedulas - NOTA_DE_CEM >= 0){
                notasDeCem += 1;
                cedulas = cedulas - NOTA_DE_CEM;
            }
            else if (cedulas - NOTA_DE_CINQUENTA >= 0) {
                notasDeCiquenta += 1;
                cedulas = cedulas - NOTA_DE_CINQUENTA;
            }
            else if (cedulas - NOTA_DE_VINTE >= 0) {
                notasDeVinte += 1;
                cedulas = cedulas - NOTA_DE_VINTE;
            }
            else if (cedulas - NOTA_DE_DEZ >= 0) {
                notasDeDez += 1;
                cedulas = cedulas - NOTA_DE_DEZ;
            }
            else if (cedulas - NOTA_DE_CINCO >= 0) {
                notasDeCinco += 1;
                cedulas = cedulas - NOTA_DE_CINCO;
            }
            else if (cedulas - NOTA_DE_DOIS >= 0) {
                notasDeDois += 1;
                cedulas = cedulas - NOTA_DE_DOIS;
            }
            else if (cedulas - NOTA_DE_UM >= 0) {
                notasDeUm += 1;
                cedulas = cedulas - NOTA_DE_UM;
            }

        }


        while (moedas != 0 && moedas >= 0) {

            if (moedas - MOEDA_DE_CINQUENTA >= 0){
                moedaDeCinquenta += 1;
                moedas = moedas - MOEDA_DE_CINQUENTA;
            }
            else if (moedas - MOEDA_DE_VINTE_E_CINCO >= 0) {
                moedaDeVinteECinco += 1;
                moedas = moedas - MOEDA_DE_VINTE_E_CINCO;
            }
            else if (moedas - MOEDA_DE_DEZ >= 0) {
                moedaDeDez += 1;
                moedas = moedas - MOEDA_DE_DEZ;
            }
            else if (moedas - MOEDA_DE_CINCO >= 0) {
                moedaDeCinco += 1;
                moedas = moedas - MOEDA_DE_CINCO;
            }
            else if (moedas - MOEDA_DE_UM_CENTAVO >= 0) {
                moedaDeUmCentavo += 1;
                moedas = moedas - MOEDA_DE_UM_CENTAVO;
            }
        }

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", notasDeCem);
        System.out.printf("%d nota(s) de R$ 50.00\n", notasDeCiquenta);
        System.out.printf("%d nota(s) de R$ 20.00\n", notasDeVinte);
        System.out.printf("%d nota(s) de R$ 10.00\n", notasDeDez);
        System.out.printf("%d nota(s) de R$ 5.00\n", notasDeCinco);
        System.out.printf("%d nota(s) de R$ 2.00\n", notasDeDois);
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", notasDeUm);
        System.out.printf("%d moeda(s) de R$ 0.50\n", moedaDeCinquenta);
        System.out.printf("%d moeda(s) de R$ 0.25\n", moedaDeVinteECinco);
        System.out.printf("%d moeda(s) de R$ 0.10\n", moedaDeDez);
        System.out.printf("%d moeda(s) de R$ 0.05\n", moedaDeCinco);
        System.out.printf("%d moeda(s) de R$ 0.01\n", moedaDeUmCentavo);

        
    }
    
}
