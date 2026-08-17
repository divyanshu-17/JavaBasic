package in.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice3S {
//Take 10 integers.
//Print all the numbers that were entered more than once.
//Example
//Input
//10 20 10 30 40 20 50 60 30 10
//Output
//Duplicate Numbers:
//10
//20
//30
//Hint: Use two Sets.
//One Set keeps track of numbers you've seen already.
//The second Set stores the duplicate numbers.
    static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        Set<Integer> setIp= new HashSet<>();
        Set<Integer> setIp2= new HashSet<>();

        System.out.println("Give 10 el.s: ");
        for (int i = 0; i < 10; i++) {

            System.out.println("Enter ele: ");
            int ele= input.nextInt();

            if (!setIp.add(ele)){
                setIp2.add(ele);
            }else {
                setIp.add(ele);
            }
        }
        System.out.println("Given set: "+setIp);
        System.out.println("Duplicate Numbers: "+setIp2);
    }
}
