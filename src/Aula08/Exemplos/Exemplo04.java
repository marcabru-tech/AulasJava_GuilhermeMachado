package Aula08.Exemplos{
public class Exemplo4 {
    public static void main(String[] args) {
        try {
            File arquivo = new File(pathname:"src\\arquivo.txt");
            if (arquivo.exists()) {
                FileReader fileReader = new FileReader(fileName:"src\\arquivo.txt");
                int caracter = fileReader.read();
                while ((caracter = fileReader.read()) != -1) {
                    System.out.print((char) caracter);
                }
            } else {
                arquivo.createNewFile();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
}
