package Exercícios.EstruturaSequencial;

import java.util.Scanner;

/*Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]. */

public class ex01 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número: ");
        numero = scan.nextInt();

        System.out.println("o número informado foi: [" + numero+"].");
        
        
    }


    
}
