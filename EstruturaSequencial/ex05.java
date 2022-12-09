package EstruturaSequencial;

import java.util.Scanner;

/* Faça um Programa que peça o raio de um círculo, calcule e mostre sua área */
public class ex05 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double raio;
        double area;

        System.out.println("Digite o raio do círculo: ");
        raio = scan.nextDouble();

        area = 3.14 * Math.pow(raio, 2); // função Math.pow serve para potencialização de números em uma função. 

        System.out.println("A área desse círculo é: " + area);
    }
    
}
