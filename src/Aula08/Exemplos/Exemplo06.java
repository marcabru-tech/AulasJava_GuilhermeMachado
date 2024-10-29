package Aula08.Exemplos;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Exemplo6 {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter(fileName:"src\\arquivo.txt", append true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(str:"\nTexto escrito no arquivo com buffer");
            bufferedWriter.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
