package Aula08.Exemplos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Exemplo5 {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("arquivo.txt", true); // Assumindo que o arquivo já existe
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Texto escrito no arquivo com buffer");
            bufferedWriter.newLine(); // Adiciona uma nova linha
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
