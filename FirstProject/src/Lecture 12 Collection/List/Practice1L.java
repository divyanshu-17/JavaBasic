package in.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice1L {
    //    Take 10 integers from the user into an ArrayList.
//            Print:
//    all elements
//    largest element
//    smallest element
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> arl= new ArrayList<>();

        System.out.println("Please enter 10 elements: ");
        for (int i = 0; i < 10; i++) {
            arl.add(input.nextInt());
        }

        System.out.println("Your elements: ");
        for (int num : arl) {
            System.out.println(num+" ");
        }

        //int max=0;
        int max=arl.get(0);
        for (int no : arl){
            if (max<no){
                max=no;
            }
        }
        System.out.println("Max of elements: "+max);

        int min = arl.get(0);
        for (int no : arl) {
            if (no < min) {
                min = no;
            }
        }
        System.out.println("Minimum of elements: "+min);
    }
}
