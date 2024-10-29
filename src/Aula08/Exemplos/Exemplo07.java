package Aula08.Exemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Exemplo7 {
    public static void main(String[] args) {
        File arquivo = new File(pathname:"src\\arquivo.txt");
        if (arquivo.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
                String linha;
                while ((linha = bufferedReader.readLine()) != null) {
                    System.out.println(linha);
                }
                bufferedReader.close();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

    }
}
