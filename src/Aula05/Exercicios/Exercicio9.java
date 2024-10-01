package Aula05.Exercicios;

import java.util.Scanner;
import java.util.Random;

public class Exercicio9 {
    public static void main(String[] args) {

        // Cria um scanner para ler a entrada do usuário

        Scanner scanner = new Scanner(System.in);

        // Cria um objeto Random para gerar números aleatórios

        Random random = new Random();

        // Gera um número aleatório entre 1 e 100

        int numeroAleatorio = random.nextInt(100) + 1;

        // Inicializa a variável para armazenar o palpite do usuário

        int palpite;

        // Inicializa o contador de tentativas

        int tentativas = 0;

        // Laço do-while para continuar solicitando palpites até que o usuário acerte

        do {
            System.out.print("Adivinhe o número (entre 1 e 100): ");
            palpite = scanner.nextInt();
            tentativas++;

            // Verifica se o palpite é maior, menor ou igual ao número aleatório

            if (palpite > numeroAleatorio) {
                System.out.println("Muito alto! Tente novamente.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número.");
            }
        } while (palpite != numeroAleatorio);

        // Exibe o número de tentativas feitas

        System.out.println("Você acertou em " + tentativas + " tentativas.");

        // Fecha o scanner para liberar recursos e memória

        scanner.close();
    }
}
