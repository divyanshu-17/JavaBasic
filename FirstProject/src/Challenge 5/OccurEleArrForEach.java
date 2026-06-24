import java.util.Scanner;

public class OccurEleArrForEach {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Occurrence of no in array");
        int[] arr= ArrayUtilityForInput.inputArray();
        System.out.print("No of which you want to find Occurrence: ");
        int inputVal= input.nextInt();

        int count=0;
        for (int num: arr){
            if (num==inputVal){
                count++;
            }
        }
        System.out.println("The no of times your ele happen in array is "+count);
    }
}
