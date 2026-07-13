package Refrence.AnotherEx;

public class PTest {
    public static void main(String[] args) {
        Child1 c1= new Child1();
        Child2 c2= new Child2();

        action(c1);
        action(c2); // as we can see with 1 statement 2 different classes' actions is taking place(Polymorphism)
    }

    public static void action(ParentP parent){
        parent.go();
    }
}
