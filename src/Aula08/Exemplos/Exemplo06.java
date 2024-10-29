package Aula08.Exemplos;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo6 {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("src/arquivo.txt", true); // Corrected path
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("\nTexto escrito no arquivo com buffer"); // Removed str:
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage()); // Informative error message
        }
    }
}
