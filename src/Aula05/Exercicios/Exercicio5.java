package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar a soma das notas e a quantidade de notas

        double soma = 0;
        int quantidadeNotas = 5;

        // Loop for para ler as 5 notas

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            soma += nota; // Acumula a nota na soma
        }

        // Calcula a média

        double media = soma / quantidadeNotas;

        // Imprime a média

        System.out.println("A média das notas é: " + media);
    }
}
