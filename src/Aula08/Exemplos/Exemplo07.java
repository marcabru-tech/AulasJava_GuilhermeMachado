

package Aula08.Exemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Exemplo7 {
    public static void main(String[] args) {
        File arquivo = new File("src/arquivo.txt"); // Corrigido o caminho do arquivo

        if (arquivo.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
                String linha;
                while ((linha = bufferedReader.readLine()) != null) {
                    System.out.println(linha);
                }
                bufferedReader.close();

            } catch (FileNotFoundException e) {
                System.err.println("Arquivo    não encontrado: " + e.getMessage()); // Mensagem informativa
            } catch (Exception e) { // Captura outras exceções não relacionadas ao arquivo
                System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            }

        } else {
            System.err.println("O arquivo 'src/arquivo.txt' não existe.");
        }
    }
}
