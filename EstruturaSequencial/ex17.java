package EstruturaSequencial;

import java.util.Scanner;

/*Faça um programa que peça o tamanho de um arquivo para download (em MB) 
e a velocidade de um link de Internet (em Mbps), 
calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos). */

public class ex17 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tamanhoArquivo,velocidadeLink,tempoDownload;

        System.out.println("qual tamanho do arquivo em MB? ");
        tamanhoArquivo = scan.nextDouble();

        System.out.println("qual a velocidade da internet (em Mbps)? ");
        velocidadeLink = scan.nextDouble();

        tempoDownload=tamanhoArquivo/(velocidadeLink/8);//8 bits equivale a 1 bite;

        System.out.println("o tempo de download é de: "+tempoDownload/120+"minutos");






    }
    
}
