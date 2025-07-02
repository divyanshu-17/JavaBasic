import java.util.Scanner;

public class AddTwoNo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter 1st no: ");
        int No1= input.nextInt();
        System.out.print("Please enter 2nd no: ");
        int No2= input.nextInt();
        int sum= No1+No2;
        System.out.print("Sum of two nos is: "+ sum);
    }
}
