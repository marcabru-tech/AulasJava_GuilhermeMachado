package Aula05.Exercicios;

public class Exercicio6 {
    public static void main(String[] args) {
        int primeiro = 0;
        int segundo = 1;
        int proximo;
        int contador = 0;

        System.out.println("Os 10 primeiros números da sequência de Fibonacci são:");

        while (contador < 10) {
            System.out.print(primeiro + " ");

            // Calcula o próximo número da sequência

            proximo = primeiro + segundo;

            // Atualiza os valores para a próxima iteração

            primeiro = segundo;
            segundo = proximo;

            contador++;
        }
    }
}
