package iniciante.sequencial.q1003;

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int valorA = in.nextInt();
        int valorB = in.nextInt();
        System.out.printf("SOMA = %d\n", valorA + valorB);
        in.close();

    }
}
