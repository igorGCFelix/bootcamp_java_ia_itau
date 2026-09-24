import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class Main{

    private final static String WELCOME_MESSAGE = "Olá, informe seu nome";

    public static void main(String[] args){
        //importando o scanner
        // Scanner scanner = new Scanner(System.in);
        // Java tem a tipagem estática, Case sensitivy
        var scanner = new Scanner(System.in);

        System.out.println("Olá, informe o seu nome: ");
        String name = scanner.next();
        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();

        System.out.println("Seu nome é "+ name + " e sua idade é "+ age);
        System.out.printf("Seu nome é %s e sua idade é %s", name, age);


    }

}
