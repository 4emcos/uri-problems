package iniciante.sequencial.p1001;

/*
EXTREMAMENTE BÁSICO

QUESTÃO
Leia 2 valores inteiros e armazene-os nas variáveis A e B. 
Efetue a soma de A e B atribuindo o seu resultado na variável X. 
Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo
que está sendo especificado e não esqueça de imprimir o fim de linha após o resultado,
caso contrário, você receberá "Presentation Error".

ENTRADA
A entrada contém 2 valores inteiros.

SAÍDA
Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor da variável X e pelo final de linha. 
Cuide para que tenha um espaço antes e depois do sinal de igualdade, conforme o exemplo abaixo.

*/

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

