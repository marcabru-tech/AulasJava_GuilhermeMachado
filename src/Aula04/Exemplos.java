package Aula04;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ex.1
        String corSemaforo = "verde";

        if (corSemaforo == "verde" || corSemaforo == "Verde") {
            System.out.println("Siga");
        } else if (corSemaforo == "amarelo" || corSemaforo == "Amarelo") {
            System.out.println("Atenção");
        } else if (corSemaforo == "vermelho" || corSemaforo == "Vermelho") {
            System.out.println("Pare");
        } else {
            System.out.println("Cor inválida no sistema");
        }
        //Ex.2

        int idade = 10;

        if (idade > 0 && idade <= 12){
            System.out.println("criança");
        } else if (idade>12 && idade <=17) {
            System.out.println("Adolescente");
        } else if (idade> 17 && idade<= 64){
            System.out.println("Adulto");
        } else if (idade< 65){
            System.out.println("idoso");
        } else {
            System.out.println("Idade inválida");
        }
        //Ex.3 _ Operador Ternário

        int x = 50;
        boolean r;
        r = x > 30 ? true : false;
        System.out.println(r);

        //Ex. 5

        idade = 10;
        String maioridade;
        maioridade = idade>18 ? "maior de idade" : "menor de idade";
        System.out.println(maioridade);

        //Ex. 6

        float preco = 100f;
        float desconto;
        desconto = preco>80 ? 0.25f : 0;
        System.out.println("Valor com desconto = "+(preco - preco*desconto) );


    }
}





