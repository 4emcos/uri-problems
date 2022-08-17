package iniciante.sequencial.p1020;
import java.util.Scanner;

/*
IDADE EM DIAS

QUESTÃO
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

ENTRADA
O arquivo de entrada contém um valor inteiro.

SAÍDA
Imprima a saída conforme exemplo fornecido.

*/



public class IdadeEmDias {

    public static final int ANO = 365;
    public static final int DIA = 30;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idade = in.nextInt();

        int anos = idade / ANO;
        int meses = (idade % ANO) / DIA;
        int dias = (idade % ANO) % DIA;

        System.out.printf("%d ano(s)\n", anos);
        System.out.printf("%d mes(es)\n", meses);
        System.out.printf("%d dia(s)\n", dias);

        in.close();
    }
    
}
