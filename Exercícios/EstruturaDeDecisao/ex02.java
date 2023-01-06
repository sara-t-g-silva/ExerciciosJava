package Exercícios.EstruturaDeDecisao;

import java.util.Scanner;

/*Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo. */
public class ex02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a;
        

        System.out.println("Digite o primeiro número: ");
        a=scan.nextInt();


        if (a<0){

            System.out.println("este número pe negativo");

        }else{
            System.out.println("este número é positivo!");
        }


        
    }
    
}
