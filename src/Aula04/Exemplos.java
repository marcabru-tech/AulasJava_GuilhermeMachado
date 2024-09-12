package Aula04;

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

        //Ex. Switch
        
        corSemaforo = "amarelo";
        switch (corSemaforo){
            case "verde", "Verde":
                System.out.println("Siga");
                break;
            case "amarelo", "Amarelo":
                System.out.println("Atenção");
                break;
            case "vermelho":
                System.out.println("Pare");
                break;
            default:
                System.out.println("Cor Inválida");


        }

        //Ex. 8

        System.out.println("Escolha uma opção");
        System.out.println("1- Opção 1");
        System.out.println("2- Opção 2");
        System.out.println("3- Opção 3");

        int escolhaUsuario =1;
        switch (escolhaUsuario){
            case 1:
                System.out.println("Parabéns, você escolheu a opção 1");
                break;
            case 2:
                System.out.println("Parabéns, você escolheu a opção 2");
                break;
            case 3:
                System.out.println("Parabéns, você escolheu a opção 3");
                break;
            default:
                System.out.println("Opçõo Inválida");
        }

//Ex Verificação de Sistema
        System.out.println("Digite a sua idade");
        int idadeUsuario = 1;
        if (idadeUsuario >= 18){
            System.out.println("Você está autorizado");
        } else System.out.println("O acesso só é permitido para maiores de 18 anos");

        //Ex Desconto em Compra

        double valorFinal =
                double desconto = valorFinal - valorFinal*0.10;

                if (valorFinal >100){
                    System.out.println("O valor total da compra com desconto de dez por cento é: "+ valorFinal);
                }

    }
}





