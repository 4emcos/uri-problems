package iniciante.selecao.p1035;
/* 
  Teste de Seleção 1
  
  QUESTÃO
  Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D
  for maior do que A, e a soma de C com D for maior que a soma de A e B e se C
  e D, ambos, forem positivos e se a variável A for par escrever a mensagem
  "Valores aceitos", senão escrever "Valores nao aceitos".
  
  Entrada
  Quatro números inteiros A, B, C e D.
  
  Saída
  Mostre a respectiva mensagem após a validação dos valores.
  
 */

import java.util.Scanner;

public class TesteDeSelacaoUm {

    public class Main {

        public void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String[] valores = input.nextLine().split(" ");
            String valorUm = valores[0];
            String valorDois = valores[1];
            String valorTres = valores[2];
            String valorQuatro = valores[3];
            int A = Integer.parseInt(valorUm);
            int B = Integer.parseInt(valorDois);
            int C = Integer.parseInt(valorTres);
            int D = Integer.parseInt(valorQuatro);
            if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) {
                System.out.println("Valores aceitos");
            } else {
                System.out.println("Valores nao aceitos");
            }

            input.close();
        }

    }
}