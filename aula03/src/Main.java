import java.util.Scanner;
//Scanner é uma ferramenta que recebe os dados digitados pelo usuário

public class Main{
    //metodo principal, String[] args possibilita o uso do terminal (args - argumentos, pode ser qqr nome que vc escolher)
    public static void main(String[] args){
        //tipo byte, int, long
        float n1 = 1.0f;
        long n2 = 1L;
        char character = 1;

        //principais operadores
        var scanner = new Scanner(System.in);
        System.out.println("Quanto é 2+2? ");
        var result = scanner.nextInt();

        if (result == 4) System.out.println("O resultado é 4, você acertou!");
        else System.out.println("Você errou!");

        System.out.println("Quanto é 1+1?");
        var result1 = scanner.nextInt();
        //isRight é boleano -> is true
        //isWrong é boleano -> is false
        var isRight = result1 == 2;
        System.out.println("O resultado é "+ isRight);

        //!=, ==, <=, >=, ===


    }
}