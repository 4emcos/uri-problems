package iniciante.sequencial.p1005;

/*
MÉDIA 1

QUESTÃO
Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. 
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11).
Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

ENTRADA
O arquivo de entrada contém 2 valores com uma casa decimal cada um.

SAÍDA
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5 dígitos após o ponto decimal
e com um espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e como 
todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".


*/


import java.util.Scanner;


public class MediaUm {

    public static final double PESO_NOTA_A = 3.5;
    public static final double PESO_NOTA_B = 7.5;
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double valorA = Double.parseDouble(in.nextLine());
        double valorB = Double.parseDouble(in.nextLine());
        double media = ( ((valorA * PESO_NOTA_A) + (valorB * PESO_NOTA_B)) / (PESO_NOTA_A + PESO_NOTA_B));
        System.out.printf("MEDIA = %.5f\n", media);
        in.close();
    }
}
