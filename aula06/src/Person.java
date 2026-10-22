public class Person {
    //Temos que proteger os atributos com GET e SET, não podemos deixar publico.
//    public String name;
//    public int age;
    //final String teste = new "teste"; -> variável estática, fixa, absoluta
    //dentro do objeto da para mudar


    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}

