import java.util.Scanner;
import java.util.ArrayList;
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
        // 2

        try{

            System.out.println("Digite sua altura em metros: ");
            double altura = scanner.nextFloat();

            System.out.println("Digite o seu peso em kg: ");
            double peso = scanner.nextFloat();

            double imc = peso/Math.pow(altura,2);

            if (imc<=0){
                System.out.println("Virou pó é?");

            } else if (imc<18.5) {
                System.out.println("Abaixo do peso");
            }
            else if (imc<24.9) {
                System.out.println("Peso ideal");
            }
            else if (imc<29.9) {
                System.out.println("Levemente acima do peso");
            }
            else if (imc<34.9) {
                System.out.println("Obesidade Grau I");
            }
            else if (imc<39.9) {
                System.out.println("Obesidade Grau II (Severa)");
            }
            else {
                System.out.println("Obesidade Grau III (Mórbida)");
            }
        }
        catch (Exception e){
            System.out.println("Digite um valor válido!");
        }

        //3
        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();
        int n2=0;
        while(n1 > n2){
            System.out.println("Digite um número maior que o primeiro digitado: ");
            n2 = scanner.nextInt();
        }
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        for (int i=n1; i<=n2; i++){
            if(i%2==0){
                pares.add(i);
            }
            else{
                impares.add(i);
            }
        }
        System.out.println("Números pares: "+ pares);
        System.out.println("Número ímpares: "+ impares);
//
        //4
        System.out.println("Digite o número para ser divisor: ");
        int divisor = scanner.nextInt();
        double resto = 0;
        while(resto == 0){
            System.out.println("Digite o dividendo: ");
            int dividendo = scanner.nextInt();
            resto = dividendo%divisor;
            if (resto!=0) System.out.println("O resto é diferente de 0, operação cancelada!");
            else System.out.println("O resto é igual a 0, digite outro dividendo!");
        }
    }
}