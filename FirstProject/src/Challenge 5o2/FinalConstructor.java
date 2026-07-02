public class FinalConstructor {
    String name;
    int age;

    public FinalConstructor(final String name,final int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        FinalConstructor person= new FinalConstructor("Dibu",20);
        System.out.println(person.name+person.age);
    }
}
