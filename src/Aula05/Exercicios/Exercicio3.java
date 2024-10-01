package Aula05.Exercicios;

import java.util.Scanner; //Importamos a classe que contém o método scanner

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        // Inicializa a variável para armazenar o fatorial

        int fatorial = 1;

        // Verifica se o número é positivo

        if (numero >= 0) {

            // Loop do-while para calcular o fatorial

            int i = 1;
            do {
                fatorial *= i;  // Multiplica o fatorial pelo valor de i
                i++;
            } while (i <= numero);

            // Imprime o resultado

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        } else {
            System.out.println("Por favor, digite um número inteiro positivo.");
        }
    }
}
