package Exercícios.EstruturaSequencial;

import java.util.Scanner;

/* Faça um Programa que peça a temperatura em graus Fahrenheit,
 transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9). */
public class ex08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double temperatura;
        double converte;

        System.out.println("Digite a temperatura em Fahrenheit: ");
        temperatura = scan.nextDouble();

        converte = 5*((temperatura-32)/9);

        System.out.println(" A temperatura de "+temperatura+"F° equivale a "+converte+"C°");

        





        
    }


    
}
