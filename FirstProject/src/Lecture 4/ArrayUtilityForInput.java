import java.util.Scanner;

public class ArrayUtilityForInput {                //this just creates a array for us
    public static int[] inputArray(){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the no of elements you need: ");
        int size= input.nextInt();
        int[] num= new int[size];
        int index=0;
        while(index<size){
            System.out.print("Please enter element no" + (index+1) +":");
            num[index]=input.nextInt();
            index++;
        }
        return num;
    }
}
// To use this in code give array any name
// int[] myArr
//Enter the class name on rhs with array calling method
//⬇️
//int[] myArr= ArrayUtilityForInput.inputArray();
//⬆️
//on rhs method .inputArray
