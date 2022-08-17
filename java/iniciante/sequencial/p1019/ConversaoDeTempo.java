package iniciante.sequencial.p1019;

/* 
Conversão de Tempo

QUESTÃO
Leia um valor inteiro, que é o tempo de duração em segundos de um 
determinado evento em uma fábrica, e informe-o expresso no formato
horas:minutos:segundos.

ENTRADA
O arquivo de entrada contém um valor inteiro N.

SAÍDA
Imprima o tempo lido no arquivo de entrada (segundos),
 convertido para horas:minutos:segundos, conforme exemplo fornecido.

*/



import java.util.Scanner;


public class ConversaoDeTempo {

    public static final int SEGUNDO = 60;
    public static final int HORA = 3600;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tempo = Integer.parseInt(in.nextLine());

        int horas = tempo / HORA;
        int minutos = (tempo / SEGUNDO) % SEGUNDO;
        int segundos = tempo % SEGUNDO;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
        in.close();

    }
}
