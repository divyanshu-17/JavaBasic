import java.util.Scanner;

public class OddEvenC5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Type no1 ");
        int no1= input.nextInt();

        String result= no1%2==0 ? "Even":"Odd";
        System.out.println("Your no is "+result);
    }
}
