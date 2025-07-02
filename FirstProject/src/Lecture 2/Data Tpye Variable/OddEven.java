import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter your No: ");
        int no=input.nextInt();

        if (no%2==0 && no!=0){
            System.out.println("No is even");
        } else if (no%2 != 0) {
            System.out.println("No is odd");
        }else {
            System.out.println("No is zero");
        }
    }
}
