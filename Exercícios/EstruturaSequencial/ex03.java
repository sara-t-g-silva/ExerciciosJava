package Exercícios.EstruturaSequencial;

/*Faça um Programa que peça as 4 notas bimestrais e mostre a média. */

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota1,nota2,nota3,nota4;
         

        System.out.println("Digite a primeira nota: ");
        nota1 = scan.nextDouble();

        System.out.println("digite a segunda nota: ");
        nota2= scan.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = scan.nextDouble();

        System.out.println("Digite a quarta nota: ");
        nota4 = scan.nextDouble();

        

        System.out.println("A média das notas é: " + (nota1+nota2+nota3+nota4)/4);
    }
    
}
