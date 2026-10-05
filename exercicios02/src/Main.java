import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        //1
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(resultado);
        }



    }
}