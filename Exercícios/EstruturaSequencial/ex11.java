package Exercícios.EstruturaSequencial;

import java.util.Scanner;



/*Tendo como dados de entrada a altura de uma pessoa, 
construa um algoritmo que calcule seu peso ideal, 
usando a seguinte fórmula: (72.7*altura) - 58 */
public class ex11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double altura;
        double calculoPesoIdeal;

        System.out.println("Digite sua altura: ");
        altura = scan.nextDouble();

        calculoPesoIdeal = (72.7*altura)-58;

        System.out.println("seu peso ideal é: " + calculoPesoIdeal);



    }
    

    

    
}
