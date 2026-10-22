public class Main {

    public static void main(String[] args) {

        //declarando o objeto Male pegando os atributos da classe Person
        //instancias
        var male = new Person();
        male.setName("João");
        male.setAge(12);

        //declarando o objeto Female pegando os atributos da classe Person
        var female = new Person();
        female.setName("Maria");
        female.setAge(10);

        //getName e getAge está ativando a função feita la no Person class
        System.out.println("Male name: "+male.getName()+ ", Male age: "+male.getAge());
        System.out.println("Female name: "+female.getName()+ ", Female age: "+female.getAge());


    }

}