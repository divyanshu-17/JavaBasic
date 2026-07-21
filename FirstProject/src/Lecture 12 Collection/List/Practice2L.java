package in.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice2L {
    public static void main(String[] args) {
//        Take N names from the user.
//
//        Then ask for another name.
//
//        If the name exists in the ArrayList, print:
//
//        Found
//
//        Otherwise print:
//
//        Not Found
        Scanner input= new Scanner(System.in);
        List<String> strNames= new ArrayList<>();

        System.out.println("Enter no of names you want?");
        int noOfNames= input.nextInt();

        System.out.println("Please input names: ");
        for (int i = 0; i < noOfNames+1; i++) {
            strNames.add(input.nextLine());
        }


        for (String str : strNames){
            System.out.println(str);
        }

        System.out.println("Enter the name you want to find out: ");
        String findName= input.nextLine();
        if (strNames.contains(findName)){
            System.out.println("found! at "+strNames.indexOf(findName));
        }else {
            System.out.println("not found");
        }

    }
}
