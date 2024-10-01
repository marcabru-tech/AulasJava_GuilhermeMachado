package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário

        Scanner scanner = new Scanner(System.in);

        // Inicializa contadores para números pares e ímpares

        int contPar = 0;
        int contImpar = 0;

        // Laço for para ler 10 números

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            // Verifica se o número é par ou ímpar

            if (numero % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }

        // Exibe a quantidade de números pares e ímpares

        System.out.println("Quantidade de números pares: " + contPar);
        System.out.println("Quantidade de números ímpares: " + contImpar);

        // Fecha o scanner

        scanner.close();
    }
}
