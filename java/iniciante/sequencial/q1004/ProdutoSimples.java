package iniciante.sequencial.q1004;

import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int valorA = in.nextInt();
        int valorB = in.nextInt();
        System.out.printf("PROD = %d\n" , (valorA * valorB));
        in.close();
        
    }
}
