package iniciante.sequencial.q1002;
import java.util.Scanner;

public class AreaDoCirculo{

    private static final double PI = 3.14159;
    private static final double MULTIPLICADOR = 2;

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double raio = Double.parseDouble(input.nextLine());
        System.out.printf("A=%.4f\n", (Math.pow(raio, MULTIPLICADOR) * (PI)));
        input.close();
    }
}
