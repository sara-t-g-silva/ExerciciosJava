package Exercícios.EstruturaDeDecisao;

import java.util.Scanner;

/*Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. */

public class ex03 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String letra;

        System.out.println("digite 'F' ou 'M' ");
        letra = scan.next();

        if(letra == "F"|| letra == "f"){
            System.out.println("F - Feminino");

        }else if(letra == "M"|| letra =="m"){
            System.out.println("M-Masculino");

        }else{
            System.out.println("sexo inválido");
        }
    }
}
