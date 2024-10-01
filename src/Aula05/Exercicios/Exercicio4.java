package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        boolean ePrimo = true; // Inicializa a flag como verdadeira

        // Verifica se o número é maior que 1 (condição básica para ser primo)

        if (numero > 1) {
            // Loop para verificar a divisibilidade por números de 2 até a raiz quadrada do número

            for (int i = 2; i <= Math.sqrt(numero); i++) { // Math.sqrt() é um método da classe Math que calcula a raiz quadrada de um número double.
                if (numero % i == 0) {
                    ePrimo = false;
                    break; // Se encontrar um divisor, não é primo, então interrompe o loop
                }
            }
        } else {
            ePrimo = false; // Números menores ou iguais a 1 não são primos
        }

        if (ePrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
