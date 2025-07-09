import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        System.out.println("We are going to find out if no is Prime");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your no: ");
        int a= input.nextInt();
        boolean isPrime= no(a);
        System.out.println(isPrime);
    }

    public static boolean no(int b) {
        if (b <= 1) {
            return false;
        } else {
            for (int i = 2; i <= b/2; i++) {
                if (b % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
