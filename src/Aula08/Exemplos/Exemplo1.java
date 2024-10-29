package Aula08.Exemplos;

public class Exemplo1 {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\marca\\Documents\\AulasJava\\src\\arquivo.txt");
        if(arquivo.exists()){
            System.out.println("arquivo existe");
        } else {
            try {
            if(arquivo.createNewFile()) {
                System.out.println(arquivo.getName() + "criado com sucesso");
            }
            } catch (IOExecption e){
                throw new RuntimeException(e);
            }
        }
    }
}
