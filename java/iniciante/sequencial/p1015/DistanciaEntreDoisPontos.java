package iniciante.sequencial.p1015;
/*
Distância Entre Dois Pontos

QUESTÃO
Leia os quatro valores correspondentes aos eixos x e y de dois pontos 
quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles,
mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = sqrt((x2 - x1)^2 + (y2 - y1)^2)

ENTRADA
O arquivo de entrada contém duas linhas de dados. A primeira linha contém 
dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

SAÍDA
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.

*/

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class DistanciaEntreDoisPontos {

    public static final int MULTIPLICADOR = 2;

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String p1[] = new String[2];
        String p2[] = new String[2];
        Map<String, Double> eixos = new HashMap<String, Double>();
        Double distancia = 0.0;
        p1 = in.nextLine().split(" ");
        p2 = in.nextLine().split(" ");

        eixos.put("x1", Double.parseDouble(p1[0]));
        eixos.put("y1", Double.parseDouble(p1[1]));
        eixos.put("x2", Double.parseDouble(p2[0]));
        eixos.put("y2", Double.parseDouble(p2[1]));

        distancia = Math.sqrt(Math.pow ((eixos.get("x2") - eixos.get("x1")), MULTIPLICADOR) +  Math.pow((eixos.get("y2") - eixos.get("y1")), MULTIPLICADOR));

        System.out.printf("%.4f", distancia);
        in.close();
    }   
    
}
