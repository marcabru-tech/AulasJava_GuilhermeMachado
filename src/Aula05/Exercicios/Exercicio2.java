package Aula05.Exercicios;

public class Exercicio2 {
    public static void main(String[] args) {

        // Inicializamos a variável para armazenar a soma

        int soma = 0;

        // Inicializamos a variável de controle do loop com o primeiro número par

        int numero = 2;

        // Loop while: continua enquanto o número for menor ou igual a 100

        while (numero <= 100) {

            // Adiciona o número atual à soma

            soma = soma + numero;

            // Incrementa o número em 2 para o próximo número par

            numero = numero + 2;
        }

        // Imprime o resultado na tela

        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}