import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("No till which Fibonacci is needed: ");
        int num= input.nextInt();
        int result=fibo(num);
        System.out.println("Fibonacci Begins.....");
        System.out.println(1+(result));
    }

    public static int fibo(int no){
        if (no==0){
            System.out.println("0");
        }
        return fibo(no-1+no-2);
    }
}
