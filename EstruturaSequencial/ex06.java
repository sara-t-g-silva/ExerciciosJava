package EstruturaSequencial;

import java.util.Scanner;

/*Faça um Programa que calcule a área de um quadrado, 
em seguida mostre o dobro desta área para o usuário. */

public class ex06 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double lado;
        double area;

        System.out.println("Digite o valor do lado do quadrado: ");
        lado = scan.nextDouble();
        
        area = 2*Math.pow(lado, 2);

        System.out.println("O dobro da área do quadrado é: "+ area);
        
        
    }

    
}
