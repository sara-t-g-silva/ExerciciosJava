package Exercícios.EstruturaSequencial;
import java.util.Scanner;

/*Faça um Programa que peça a temperatura em graus Celsius, 
transforme e mostre em graus Fahrenheit. */

public class ex09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        double temperatura;
        double converte;

        System.out.println("Digite a temperatura em °C");
        temperatura = scan.nextDouble();

        converte = temperatura * 1.8 +32;

        System.out.println(" A temperatura de "+temperatura+"°C equivale a "+converte+"°F");



    }
    
}
