package Exercícios.EstruturaSequencial;

import java.util.Scanner;

/*Faça um Programa para uma loja de tintas.
O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e 
que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões 
de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços 
em 3 situações:
comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
misturar latas e galões, de forma que o desperdício de tinta seja menor. 
Acrescente 10% de folga e sempre arredonde os valores para cima, 
isto é, considere latas cheias. */

public class ex16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double areaSerPintada,quantidadeDeLatas18,quantidadeDeLatas3600;
        double lata18 = 80.0;
        double lata3600=25.0;
        
        
        System.out.println("Quantos metros quadrados tem na área a ser pintada? ");
        areaSerPintada = scan.nextDouble();

        quantidadeDeLatas18 = areaSerPintada/(18*6);
        quantidadeDeLatas3600=areaSerPintada/(3.6*6);


        System.out.println(" A quantidade de latas de tinta que são necessárias caso compre apenas latas de 18 litros: " + quantidadeDeLatas18);
        System.out.println("o valor total é de R$ "+quantidadeDeLatas18*lata18);
        System.out.println("A quantidade de latas de tinta que são necessárias caso compre apenas latas de 3,6 litros:"+quantidadeDeLatas3600);
        System.out.println("o valor total é de R$ "+quantidadeDeLatas3600);
        

        

        


       

    }
}
    

