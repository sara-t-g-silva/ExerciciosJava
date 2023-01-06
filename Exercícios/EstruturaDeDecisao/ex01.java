package Exercícios.EstruturaDeDecisao;

import java.util.Scanner;

/*Faça um Programa que peça dois números e imprima o maior deles. */

public class ex01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Digite o primeiro número: ");

        a=scan.nextInt();

        System.out.println("Digite o segundo número: ");
        b=scan.nextInt();

        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }


        
    }

    
}
