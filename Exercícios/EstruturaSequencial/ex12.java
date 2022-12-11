package Exercícios.EstruturaSequencial;

import java.util.Scanner;
/*Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7 */
public class ex12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double calculoPesoH, calculoPesoM;

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        calculoPesoH = (72*altura)-58;
        calculoPesoM = (62.1*altura)-44.7;

        System.out.println(calculoPesoH );
        System.out.println(calculoPesoM);




    }
    
}
