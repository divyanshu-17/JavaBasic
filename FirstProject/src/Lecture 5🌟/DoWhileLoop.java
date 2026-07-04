import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("Age input");
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Age ");
//        int age= input.nextInt();
//        while (age<0 || age>100){  // Using while loop
//            System.out.println("Enter Age ");
//            age= input.nextInt();
//        }
        int age;
        do {
            System.out.println("Enter Age ");
            age= input.nextInt();
        }while (age<0 || age>100);
        System.out.println("Your age is: "+age);
    }
}
