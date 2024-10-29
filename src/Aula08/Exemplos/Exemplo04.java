package Aula08.Exemplos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo4 { // Corrigido o ponto e vírgula
    public static void main(String[] args) {
        try {
            File arquivo = new File("src/arquivo.txt"); // Caminho correto
            if (arquivo.exists()) {
                FileReader fileReader = new FileReader(arquivo);
                int caracter;
                while ((caracter = fileReader.read()) != -1) {
                    System.out.print((char) caracter);
                }
                fileReader.close(); // Fechando o FileReader
            } else {
                arquivo.createNewFile();
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}

