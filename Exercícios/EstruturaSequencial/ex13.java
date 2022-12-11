package Exercícios.EstruturaSequencial;

import java.util.Scanner;

/*João Papo-de-Pescador, homem de bem, 
comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca
do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. 
João precisa que você faça um programa que leia a variável peso (peso de peixes) 
e calcule o excesso. 
Gravar na variável excesso a quantidade de quilos além do limite e na variável multa
o valor da multa que João deverá pagar. 
Imprima os dados do programa com as mensagens adequadas. */
public class ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double quantidadePesca;
        double multa;
        double excesso;

        System.out.println("Digite a quantidade de kg pescado: ");
        quantidadePesca = scan.nextDouble(); // kg de pesca permitido é 50kg

    
        excesso = quantidadePesca - 50;
        multa = excesso * 4.00;

        System.out.println("a quantidade de kg em pesca foi: "+ quantidadePesca);
        System.out.println("a quantidade de pesca excedente foi: "+excesso);
        System.out.println("SUa multa de acordo com o estado de São Paulo será: "+multa);
               

        



    }
    
}
