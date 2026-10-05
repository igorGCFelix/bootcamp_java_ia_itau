import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // estrutura if e else
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (S/N)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        if (age >=18) System.out.printf("Você tem %s anos, você pode dirigir \n", age);
        else if (age >= 16 && isEmancipated) System.out.println("Você pode dirigir");
        else System.out.print("Você não possui a idade mínima para poder dirigir!");

        //estrutura switch case
        //pode ser case 1 -> System.out.println("Domingo);
        System.out.println("Escolha um número de 1 até 7:");
        var option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        /*
        * case 1, 7 {
        *   var day = option == 1 ? "Domingo" : "Sábado";
        *   yield String.format("Hoje é %s, fim de semana uhull \\o/", day);
        *   //yield é para retornar
        * }
        * */

        //estrutura de repetição for
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }
        //break interrompe
        //continue continua para o proximo indice (da para usar isso para continuar o fluxo mas n fazer nada ou fazer alguma coisa em específico)


        //estrutura de repetição while
        var name2 = "";
        while(!name2.equals("exit")){
            System.out.println("Informe seu nome: ");
            name2 = scanner.next();
            System.out.println(name2);
            break;
        }

        //estrutura de repetição do e while
        var i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i<10);


    }
}