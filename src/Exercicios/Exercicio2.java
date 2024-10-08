package Exercicios;

// Exercício 2: Função que soma dois números
// Criação de uma função chamada somar que recebe dois números e retorna a soma deles
public static int somar(int a, int b) {
    return a + b;  // Retorna a soma dos dois números
}

// Método principal (main) que chama as duas funções
public static void main(String[] args) {
    // Chamando a função que imprime a saudação
    imprimirSaudacao();

    // Declarando dois números inteiros
    int num1 = 5;
    int num2 = 10;

    // Chamando a função somar e exibindo o resultado
    int resultado = somar(num1, num2);
    System.out.println("A soma dos números é: " + resultado);
}
}
