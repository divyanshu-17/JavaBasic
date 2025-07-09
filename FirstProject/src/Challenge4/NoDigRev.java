import java.util.Scanner;

public class NoDigRev {
    public static void main(String[] args) {
        System.out.println("we are going to reverse the digits of given nos ");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a no ");
        int a = input.nextInt();
        int Reverse = noRev(a);
        System.out.println("Your no before reverse is: " + a);
        System.out.print("Your reversed no is: " + Reverse);
    }

    public static int noRev(int b) {
        int rev = 0;
        while (b != 0) {
            rev = rev * 10 + b % 10;
            b = b / 10;
        }
        return rev;
    }
}