package Aula06.Exemplos;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[4];
        String mostraValor = "vetor{";
        for (int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.println("Digite o" + posicao+ "numero");
            vetor[posicao] = scanner.nextInt();
            mostraValor += vetor[posicao];
            mostraValor += posicao < vetor.length-1 ? ", ":"}";
        }

        System.out.println(mostraValor);

    }
}
