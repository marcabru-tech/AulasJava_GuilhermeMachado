package Aula05.Exemplos;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        String nome = "Guilherme", nomeDigitado;
        Scanner entradaTeclado = new Scanner(System.in);

        do {
            System.out.println("Digite o seu nome");
            nomeDigitado = entradaTeclado.nextLine();

        }while (!nome.equals(nomeDigitado));
        System.out.println("Nome correto!");
    }
}
