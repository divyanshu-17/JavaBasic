package Equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1= new Person("Dibu",22,"A95D");
        Person person2= new Person("Dibu",22,"A95D");

        if (person1.equals(person2)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
    }



}
