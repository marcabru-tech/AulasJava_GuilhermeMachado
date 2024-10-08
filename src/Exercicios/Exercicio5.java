package Exercicios;

public class Exercicio5 {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 5.6;
        double nota3 = 7.8;
        double media = calculoMedia(nota1, nota2, nota3);


        System.out.println("A média das notas do aluno é" + media);
    }

    static double calculoMedia(double nota1, double nota2, double nota3) {

        return (nota1 + nota2 + nota3) / 3;
    }
}
