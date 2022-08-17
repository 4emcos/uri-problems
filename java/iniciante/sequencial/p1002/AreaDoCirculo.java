package iniciante.sequencial.p1002;

/*
ÁREA DO CÍRCULO

QUESTÃO
A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

ENTRADA
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

SAÍDA
Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. 
Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado,
 caso contrário, você receberá "Presentation Error".

*/

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
