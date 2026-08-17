package in.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice2S {
//Take N names from the user.
//If the user enters the same name again,
//print
//Already exists
//otherwise
//Added Successfully
//Hint: Check the return value of add().
    static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        Set<Integer> setIp= new HashSet<>();

        System.out.println("No ele.s you want?: ");
        int noOfEle= input.nextInt();

        System.out.println("Feed "+noOfEle+" ele.s in HashSet");
        for (int i = 0; i < noOfEle; i++) {
            System.out.print("Enter element: ");
            int element = input.nextInt();

            if (setIp.add(element)) { //Set automatically only takes unique value, we here are just adding it
                System.out.println("Added Successfully");
            } else {
                System.out.println("Already exists");
            }
        }
        System.out.println("Final Set of ele.s "+setIp);
    }
}
