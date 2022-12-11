package EstruturaSequencial;

import java.util.Scanner;

/*Faça um Programa que pergunte quanto você ganha por hora e o número de 
horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, 
sabendo-se que são descontados 11% para o Imposto de Renda, 
8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
salário bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido. */
public class ex14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorDaHora, horasTrabalhadas,salarioBruto,ir,inss,sindicato,salarioLiquido;
        


        System.out.println("Digite o valor da hora trabalhada: ");
        valorDaHora = scan.nextDouble();

        System.out.println("Digite quantas horas trabalha por dia: ");
        horasTrabalhadas = scan.nextDouble();

        salarioBruto = (valorDaHora*horasTrabalhadas)*30; // considerando que as folgas são remuneradas, que o mÊs virgente tem 30dias.
        ir = salarioBruto*0.11;
        inss = salarioBruto*0.08;
        sindicato=salarioBruto*0.05;
        salarioLiquido=salarioBruto-ir-inss-sindicato;

        
        System.out.println("+ Salário bruto: R$ " + salarioBruto );
        System.out.println("- IR (11%) : R$ " + ir);
        System.out.println("- INSS (8%) : R$ " + inss);
        System.out.println("- Sindicato ( 5%) : R$ "+sindicato);
        System.out.println("= Salário Liquido : R$ " + salarioLiquido);
        




        
    }

    
}
