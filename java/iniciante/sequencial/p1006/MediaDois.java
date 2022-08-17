package iniciante.sequencial.p1006;

/*
MÉDIA 2

QUESTÃO
Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. 
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem 
peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre
com uma casa decimal.

ENTRADA
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

SAÍDA
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito
após o ponto decimal e com um espaço em branco antes e depois da igualdade. Assim como 
todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso 
contrário, você receberá "Presentation Error".

*/


import java.util.Scanner;

public class MediaDois {

    public static final double PESO_NOTA_A = 2;
    public static final double PESO_NOTA_B = 3;
    public static final double PESO_NOTA_C = 5;

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        double notaA = Double.parseDouble(in.nextLine());
        double notaB = Double.parseDouble(in.nextLine());
        double notaC = Double.parseDouble(in.nextLine());

        double media = ((notaA * PESO_NOTA_A) + (notaB * PESO_NOTA_B) + (notaC * PESO_NOTA_C)) / (PESO_NOTA_A + PESO_NOTA_B + PESO_NOTA_C);

        System.out.printf("MEDIA = %.1f\n" , media);

        in.close();

    }
    
}
