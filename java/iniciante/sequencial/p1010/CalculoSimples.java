package iniciante.sequencial.p1010;

/*
Cálculo Simples

QUESTÃO
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 
e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

ENTRADA
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, 
respectivamente dois inteiros e um valor com 2 casas decimais.

SAÍDA
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de 
deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.

*/


import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String itemA[] = new String[3];
        String itemB[] = new String[3];

        itemA = in.nextLine().split(" ");
        itemB = in.nextLine().split(" ");
       
        int quantidadeItemA = Integer.parseInt(itemA[1]);
        int quantidadeItemB = Integer.parseInt(itemB[1]);

        double valorA = Double.parseDouble(itemA[2]);
        double valorB = Double.parseDouble(itemB[2]);

        double valorAPagar = (valorA * quantidadeItemA) + (valorB * quantidadeItemB);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorAPagar);
        in.close();


    }
}

