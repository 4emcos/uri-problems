package iniciante.sequencial.p1017;
/*
Gasto de Combustível


QUESTÃO
Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.

ENTRADA
O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e o segundo é a velocidade média durante a mesma (em km/h).

SAÍDA
Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal

*/



import java.util.Scanner;

public class GastoDeCombustivel {

    public static final double LITROS_POR_KM = 12.0;

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int tempoDeViagem = in.nextInt();
        int veloMedia = in.nextInt();

        double combustivelNecessario = (tempoDeViagem * veloMedia) / LITROS_POR_KM;

        System.out.printf("%.3f\n", combustivelNecessario);

        in.close();



    }
}
