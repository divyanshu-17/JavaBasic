import java.util.Scanner;

public class AgainSwap {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to swapping station");
        System.out.print("Enter first no (a) is : ");
        float a= input.nextFloat();
        System.out.print("Enter second no (b) is : ");
        float b= input.nextInt();

        float c = a;
        a=b;
        b=c;

        System.out.println("Swapping Done.............");
        System.out.println("After swap a is "+a);
        System.out.println("After swap b is "+b);
    }
}
