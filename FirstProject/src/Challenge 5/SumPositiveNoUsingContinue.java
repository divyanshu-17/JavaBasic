import java.util.Scanner;

public class SumPositiveNoUsingContinue {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Input nos +ve or -ve");
        int[] arr=ArrayUtilityForInput.inputArray();

        int sum=0;
        for (int num:arr){
            if (num<0){
                continue;
            }
            else{
                sum+=num;
            }
        }
        System.out.println("Sum of nos is "+sum);
    }
}
