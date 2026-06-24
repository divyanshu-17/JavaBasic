import java.util.Scanner;

public class EvenNoOnlyContinue {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Input nos ");
        int[] arr=ArrayUtilityForInput.inputArray();

        int even=0;
        for (int num:arr){
            if (num%2!=0){
                continue;
            }
            else{
                even+=num;
            }
        }
        System.out.println("Sum of nos is "+even);
    }
}
