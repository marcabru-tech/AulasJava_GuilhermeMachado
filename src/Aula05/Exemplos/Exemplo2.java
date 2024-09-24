package Aula05.Exemplos;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        String nome = "Guilherme", nomeDigitado;
        System.out.println("Digite seu nome");
        Scanner entradaTeclado = new Scanner(System.in);
        nomeDigitado = entradaTeclado.nextLine();
        while (!nome.equals(nomeDigitado)){
            System.out.println("Nome errado. Digite novamente");
            nomeDigitado = entradaTeclado.nextLine();

        }
        System.out.println("Correto! O nome está certo.");
    }
}
