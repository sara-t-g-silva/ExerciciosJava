package EstruturaSequencial;

import java.util.Scanner;

/* Faça um Programa que converta metros para centímetros. */
public class ex4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int  metro;

        System.out.println("digite a metragem: ");
        metro = scan.nextInt();

        System.out.println(metro +"M representa: " + (metro*1000)+"cm");
    }
    
}
