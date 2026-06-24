import java.util.Scanner;

public class ArrMaxValForEach {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("No of elements you want:  ?");
        int no= input.nextInt();
        int[] arr= new int[no];

        int index=0;  //No array me input ho rha h
        while(index<no){
            System.out.print("Please enter element no" + (index+1) +":");
            arr[index]=input.nextInt();
            index++;
        }

        int max=Integer.MIN_VALUE;
        for (int num:arr){
            if (max<num){
                max=num;
            }
        }
        System.out.println("Maximum no is: "+max);
    }

}
