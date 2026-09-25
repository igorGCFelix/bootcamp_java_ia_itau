import  java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    //criando os arrays de forma static
    //static String[] nomes;
    //static double[] notas;

    //fazendo desse jeito para que seja possivel fazer as operaçoes do array
    static ArrayList<String> nomes = new ArrayList<>();
    static ArrayList<Double> notas = new ArrayList<>();

    //Métodos
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
                    listar_notas();
                case 3:
                    alterar_nota(1, "João Silva", 6.5);
                case 4:
                    excluir_nota(3);
                case 0:
                    estaAtivo = true;
                default:
                    System.out.println("Valor inválido");
            }
        }
    }

    public static void adicionar_nota(String nome, double nota){
        nomes.add(nome);
        notas.add(nota);
    }

    public static void listar_notas(){
        for(int i=0;i<=nomes.size();i++){
            System.out.printf("A nota do aluno %s é %s", nomes.get(i), notas.get(i));
        }
    }

    public static void alterar_nota(int indice, String nome, double nota){
        nomes.set(indice, nome);
        notas.set(indice, nota);
    }

    public static void excluir_nota(int indice){
        nomes.remove(indice);
        notas.remove(indice);
    }

    public static void main(String[] args) {
        menu();
    }
}