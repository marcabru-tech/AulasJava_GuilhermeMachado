package Aula06.Exemplos;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[4];

        System.out.println("Digite o primeiro numero");
        vetor[0] = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        vetor[1] = scanner.nextInt();
        System.out.println("Digite o terceiro numero");
        vetor[2] = scanner.nextInt();
        System.out.println("Digite o quarto numero");
        vetor[3] = scanner.nextInt();
        System.out.println("vetor{+vetor[0]"+ "+vetor[1]"+ "+vetor[2]"+ "+vetor[3]");




    }
}
