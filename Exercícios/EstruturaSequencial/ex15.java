package Exercícios.EstruturaSequencial;

import java.util.Scanner;

/*Faça um programa para uma loja de tintas. 
O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a 
tinta é vendida em latas de 18 litros, que custam R$ 80,00. 
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total. */
public class ex15 {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double areaSerPintada;
        double valorDaLata = 80.0;
        double quantidadeDeLatas;
        
        System.out.println("Quantos metros quadrados tem na área a ser pintada? ");
        areaSerPintada = scan.nextDouble();

        quantidadeDeLatas = areaSerPintada/(18*3);

        System.out.println(" A quantidade de latas de tinta que são necessárias são: " + quantidadeDeLatas);
        System.out.println("o valor total é de R$ "+quantidadeDeLatas*valorDaLata);

        

        


       

    }
}
