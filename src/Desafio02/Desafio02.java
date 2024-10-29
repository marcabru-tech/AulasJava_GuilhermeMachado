package Aula07;

import java.util.Scanner;

public class Desafio2 {

    static String[][] matrizCadastro = {null};
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] cabecalho = {"ID", "Nome", "Telefone", "Email"};
        matrizCadastro[0]=cabecalho;

        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Para cadastrar um usuário");
            System.out.println("2 - Para exibir o cadastro");
            System.out.println("3 - Para atualizar um usuário");
            System.out.println("4 - Para deletar um usuário");
            System.out.println("5 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    exibirCadastro( cabecalho);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Fim do Programa!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao != 5);
    }

    private static void cadastrarUsuario() {

        System.out.print("digite a quantidade de pessoas a serem cadastradas:");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();
        String[][] novaMatriz = new String[qtdPessoas + matrizCadastro.length][matrizCadastro[0].length];

        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                novaMatriz[linhas][colunas] = matrizCadastro[linhas][colunas];
            }
        }

        System.out.println("Preencha os dados a seguir: ");

        for (int linhas = matrizCadastro.length; linhas < novaMatriz.length; linhas++) {
            novaMatriz[linhas][0] = String.valueOf(linhas);
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                System.out.print(matrizCadastro[0][colunas] + ": ");
                novaMatriz[linhas][colunas] = scanner.nextLine();
            }
        }
        matrizCadastro =  novaMatriz;
    }

    private static void exibirCadastro( String[] cabecalho) {
        String tabela = "";
        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < cabecalho.length; colunas++) {
                tabela += matrizCadastro[linhas][colunas];
                tabela += colunas == 0 ? "\t" : "\t\t\t";
            }
            tabela += "\n";
        }
        System.out.println(tabela);
    }
    private static void atualizarUsuario(){
        exibirCadastro();
        System.out.print("Digite o id do usuário que deseja atualizar");
        int idUsuario = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Atualiza as informações a seguir");
        System.out.println(matrizCadastro[0]0+"-" + idUsuario);



        for (int colunas = 1; colunas < matrizCadastro[0].length; colunas++) {

            System.out.print(matrizCadastro[0][colunas]);
            matrizCadastro[idUsuario][colunas] = scanner.nextLine();

        }
        System.out.println("Usuário atualizado com sucesso");
        exibirCadastro();


    }

    private static void deletarUsuario(){
        exibirCadastro();
        System.out.println("Digite o usuário que deseja deletar");
        int idUsuario = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz = new String[matrizCadastro.length-1][matrizCadastro[0].length];
        for (int linhaMatrizCadastro = 0, linhaNovaM = 0; linhaMatrizCadastro < matrizCadastro.length; linhaMatrizCadastro++) {
            if(idUsuario == linhaMatrizCadastro)
                continue;
            novaMatriz[linhaNovaM] = matrizCadastro[linhaMatrizCadastro];

            linhaNovaM++;
        }
    }

}

