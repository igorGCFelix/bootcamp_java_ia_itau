import  java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void menu(){
        boolean estaAtivo = false;
        while (!estaAtivo){
            System.out.println("Escolha uma das opções: \n [1] Adicionar Nota \n [2] Consultar notas \n [3] Alterar notas \n [4] Excluir notas \n [0] Sair ");
            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    adicionar_nota("João", 7.5);
                    adicionar_nota("Maria Farah", 8.5);
                    adicionar_nota("Henrique Lima", 7);
                    adicionar_nota("Claudio José", 5.5);
                case 2:
                    listar_notas(nomes, notas);
                case 3:
                    alterar_nota(1, "João Silva", 6.5);
                case 4:
                    excluir_nota(3);
                case 0:
                    estaAtivo = true;
                default:
                    print("Valor inválido");
            }
        }
    }



    public static void main(String[] args) {
        char[] nomes = {};
        float[] notas = {};
        menu();

    }
}