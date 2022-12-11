package Exercícios.EstruturaSequencial;

import java.util.Scanner;

/*Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
1.o produto do dobro do primeiro com metade do segundo .
2.a soma do triplo do primeiro com o terceiro.
3.o terceiro elevado ao cubo. */

public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero1, numero2;
        double numero3;

        System.out.println("Digite o primeiro número inteiro: ");
        numero1 = scan.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        numero2 = scan.nextInt();

        System.out.println("Digite o terceiro número, mas este pode ser real: ");
        numero3 = scan.nextDouble();

        System.out.println("O produto do dobro do primeiro com o terceiro é: "+((2*numero1)*(numero2/2)));

        System.out.println(" A soma do triplo do primeiro com o terceiro é: " + ((3*numero1)+numero3));

        System.out.println(" o terceiro elevado ao cubo é: " + Math.pow(numero3, 3));




        
    }
}
