package Aula05.Exercicios;

import java.util.Scanner; // Importamos a classe que contém o método do Scanner

public class Exercicio7 {
    public static void main(String[] args) {
        // Criamos um objeto Scanner para ler a entrada do usuário

        Scanner scanner = new Scanner(System.in);

        // Declaramos a variável para armazenar a nota

        double nota;

        // Utilizamos um laço do-while para garantir que a nota seja válida

        do {
            // Solicitamos ao usuário que digite a nota

            System.out.print("Digite uma nota de 0 a 10: ");
            nota = scanner.nextDouble();

            // Verificamos se a nota está fora do intervalo válido

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10); // Repetimos enquanto a nota for inválida

        // Exibimos a nota válida informada

        System.out.println("Nota válida informada: " + nota);

        // Fechamos o scanner para liberar recursos

        scanner.close();
    }
}

