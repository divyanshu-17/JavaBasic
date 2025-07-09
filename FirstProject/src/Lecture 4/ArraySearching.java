import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args){
        System.out.println("We'll see if the no is present in the Array\n");
        Scanner input= new Scanner(System.in);
        int[] arr= {1 ,15 ,24 ,31 , 39 ,46 ,53, 77, 98};
        System.out.print("Enter the no you want to search: ");
        int num= input.nextInt();
        boolean isFound= isFound(arr, num);
        if(isFound){
            System.out.println("No is present");
        }
        else{
            System.out.println("No not found");
        }


    }

    public static boolean isFound(int arr[], int num){
        int index=0;
        while(index < arr.length){
            if(arr[index]==num){
                return true;
            }
            index++;
        }
        return false;
    }
}
