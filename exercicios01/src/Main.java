import java.util.Scanner;
//importando o localdate para poder consultar a data local do computador
import java.time.LocalDate;

public class Main{

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        //1
        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite o seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        //pegando a data atual do sistema operacional
        var dataAtual = LocalDate.now();
        //pegando o ano da data atual
        int anoAtual = dataAtual.getYear();
        //subtraindo o ano atual com o nascimento
        int idade = anoAtual - anoNascimento;
        System.out.printf("O seu nome é %s e você tem %s anos! \n", nome, idade);

        //2
        System.out.println("Digite o lado de um quadrado: ");
        float ladoQuadrado = scanner.nextFloat();
        float areaQuadrado = ladoQuadrado * ladoQuadrado;
        System.out.println("A área do quadrado é: "+ areaQuadrado);

        //3
        System.out.println("Digite a base do retângulo: ");
        float baseRetangulo = scanner.nextFloat();
        System.out.println("Digite a altura do retângulo: ");
        float alturaRetangulo = scanner.nextFloat();
        float areaRetangulo = baseRetangulo * alturaRetangulo;
        System.out.println("A área do retângulo é: "+ areaRetangulo);

        //4
        System.out.println("Digite o nome da primeira pessoa: ");
        String nomePessoa1 = scanner.next();
        System.out.println("Digite a idade da primeira pessoa: ");
        int idadePessoa1 = scanner.nextInt();

        System.out.println("Digite o nome da segunda pessoa: ");
        String nomePessoa2 = scanner.next();
        System.out.println("Digite a idade da segunda pessoa: ");
        int idadePessoa2 = scanner.nextInt();

        int diferencaIdade = idadePessoa1 - idadePessoa2;
        diferencaIdade = (diferencaIdade<0)? Math.abs(diferencaIdade): diferencaIdade;
        System.out.println("A diferença entre as idade de "+nomePessoa1+ " e "+nomePessoa2+ " é de "+ diferencaIdade+ " anos. \n");

    }

}