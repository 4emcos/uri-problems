package iniciante.sequencial.p1016;

/**
DISTÂNCIA

QUESTÃO 
Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.

Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.

ENTRADA
O arquivo de entrada contém um número inteiro.

SAÍDA
Imprima o tempo necessário seguido da mensagem "minutos".
 
 */

import java.util.Scanner;

public class Distancia {

    public static final int MULTIPLICADOR = 2;

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int distancia = in.nextInt();

        System.out.printf("%d minutos\n" , (distancia * MULTIPLICADOR));
        in.close();
    }
}