package Person2;

public class PerInTest {
    public static void main(String[] args) {
        PersonInherit person1= new PersonInherit("Dibu",22);
        PersonInherit person2= new PersonInherit("Dibu",22);

        if (person1.equals(person2)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
    }
}
