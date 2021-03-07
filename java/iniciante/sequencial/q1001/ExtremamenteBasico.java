package iniciante.sequencial.q1001;
import java.util.Scanner;


public class ExtremamenteBasico {

    public static void main( String[] args ){
		
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		System.out.println("X = " + (A + B));
		input.close();
    }
    
}

