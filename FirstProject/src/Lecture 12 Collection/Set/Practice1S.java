package in.Set;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Practice1S {
//Take 10 integers from the user.
//Print only the unique numbers.
    static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        Set<Integer> setIp= new HashSet<>();

        System.out.println("No ele.s you want?: ");
        int noOfEle= input.nextInt();

        System.out.println("Feed "+noOfEle+" ele.s in HashSet");
        for (int i = 0; i < noOfEle; i++) {
            setIp.add(input.nextInt());
        }
        System.out.println("Unique ele.s of set:");
        for (int i : setIp){
            System.out.printf("%d ",i);
        }
        System.out.println();
        System.out.println(setIp.size());
    }
}
