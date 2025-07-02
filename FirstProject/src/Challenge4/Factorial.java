
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("We will be calculating Factorial");
        System.out.print("Enter a no till which factorial is needed: ");
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        int end=Factorial(a);
        System.out.println("Factorial of "+a+" is "+end);

    }

    public static int Factorial(int no){
        int b=1;
        int result=1;
        while(b<=no){
            result=result*b;
            b++;
        }
        return result;

    }
}
