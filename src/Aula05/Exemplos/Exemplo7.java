package Aula05.Exemplos;

import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {
        int fatorial, numDigitado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para saber seu fatorial");
        numDigitado = scanner.nextInt();
        fatorial = numDigitado;
        for (int contador = 1;contador>numDigitado; contador++){
            fatorial*=contador;
            System.out.println("O fatorial de " + numDigitado + "é " + fatorial);
        }

    }
}
