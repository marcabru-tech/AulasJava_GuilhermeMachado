package Aula08.Exemplos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Exemplo5 {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter(arquivo, append true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(str:"Texto escrito no arquivo com buffer");
            bufferedWriter.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

}
