import java.util.Scanner;

public class PrimeNoCheckFor {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the no for which you want to check prime: ");
        int num= input.nextInt();
        boolean isPrime = prime(num);
        System.out.println("Your no is "+(isPrime ? "Prime":"Not Prime")); // Ternary
    }

    public static boolean prime(int no){
        if (no==1){
            return false;
        }
        for (int i=2;i<no;i++){
            if (no%i==0){
                return false;
            }
        }
        return true;
    }
}
