package in.Challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        List<String> descendList= new ArrayList<>();

        System.out.println("How many ele.s you want to add?: ");
        int noOfInput= input.nextInt();

        System.out.println("Enter your ele.s ");
        for (int i = noOfInput; i >0; i--) {
            String addInput=input.nextLine();
            Collections.addAll(descendList,addInput);
        }

        System.out.println("Now we'll sort the ele.s ");
        Collections.sort(descendList);

        System.out.println("We'll print in descending order ");
        Collections.reverse(descendList);

        System.out.println(descendList);
    }
}
