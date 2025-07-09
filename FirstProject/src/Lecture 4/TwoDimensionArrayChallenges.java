import java.util.Scanner;

public class TwoDimensionArrayChallenges {
    public static void main(String[] args) {
        System.out.println("We'll find sum and avg of all the elements in an array");
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the no of elements required: ");
        int size= input.nextInt();
        int[] arr= new int[size];
        int index=0;
        while(index<size){
            System.out.print("Please enter element no " + (index+1) +":");  //index+1 simply for aesthetics, it
            arr[index]=input.nextInt();                             // displays real index 0+1 means type a element
            index++;                           // at index 0= please enter ele no 1
        }
        int aSum= sum(arr);
        int aAvg= avg(arr);
        System.out.println("Sum of no is: "+ aSum);
        System.out.println("Avg of no is: "+ aAvg);
    }
    public static int sum(int[] arr){
        int index=0;  //or simply i
        int a=0;
        while (index<arr.length){
            a=a+arr[index];  // Why arr[index]
            index++;
        }
        return a;   //Learn abt return statement
    }

    public static int avg(int[] arr){
        int againSum= sum(arr);
        return (againSum/ arr.length);
    }
}
