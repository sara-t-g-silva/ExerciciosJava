package EstruturaSequencial;

import java.util.Scanner;

/*Faça um Programa que pergunte quanto você ganha por hora 
e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês */

public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorDaHora;
        double horasTrabalhadas;
        double salarioMensal;

        System.out.println("Digite o valor da hora trabalhada; ");
        valorDaHora = scan.nextDouble();

        System.out.println("Digite quantas horas trabalha por dia: ");
        horasTrabalhadas = scan.nextDouble();

        salarioMensal = (valorDaHora*horasTrabalhadas)*30; // considerando que as folgas são remuneradas, que o mÊs virgente tem 30dias.

        System.out.println("O valor do salário desse mês foi: " + salarioMensal);




        


        
    }
    
}
