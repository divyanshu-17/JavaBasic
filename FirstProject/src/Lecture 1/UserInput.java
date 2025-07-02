import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name= input.nextLine();
        System.out.println("Good Morning "+ name);
        System.out.print(name+ " Please, enter your age: ");
        int age= input.nextInt();
        System.out.println("You're age is: "+ age);
        System.out.print("Please enter your account number: ");
        float acc= input.nextFloat();
        System.out.println("Your acc no is: "+acc);
    }
}
