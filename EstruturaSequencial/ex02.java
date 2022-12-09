package EstruturaSequencial;

import java.util.Scanner;

/*Faça um Programa que peça dois números e imprima a soma. */

public class ex02 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("digite o primeiro número: ");
        numero1 = scan.nextInt();

        System.out.println("digite o segundo número: ");
        numero2 = scan.nextInt();

        System.out.println("A soma dos dois número é: " + (numero1+numero2));
        
    }
    
}
