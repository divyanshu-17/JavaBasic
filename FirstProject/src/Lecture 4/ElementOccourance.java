import java.util.Scanner;

public class ElementOccourance {
    public static void main(String[] args) {
        System.out.println("We'll see how many this a no occurs in our array");
        Scanner input= new Scanner(System.in);
        int[] myArr= {2,5,7,11,17,11,23,24,39,48,24,59,66,71,90,99,33,7};
        System.out.print("No you want to check: ");
        int check= input.nextInt();
        int a=count(check,myArr);
        System.out.println("The no of time given no is present in Array is "+ a);
    }

    public static int count(int check, int[] myArr){
        int i=0;
        int b=0;
        while (i<myArr.length){      // it will keep on going till the last element
            if (myArr[i]==check){    //myArr[i] in array at index i
                b+=1;
            }
            i++;
        }
        return b;
    }
}
