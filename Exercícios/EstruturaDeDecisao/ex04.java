package Exercícios.EstruturaDeDecisao;
/*Faça um Programa que verifique se uma letra digitada é vogal ou consoante. */

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String letra;

        System.out.println("Digite uma letra: ");
        letra = scan.next();

        if(letra =="a"){
            System.out.println("é vogal");

        }else if(letra == "e") {
            System.out.println("é vogal");
        }

        System.out.println("é consoante");
    }

    
}
