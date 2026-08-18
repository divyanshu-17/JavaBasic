package in.Challenge;

import java.util.Scanner;

public class ConcatenateStrVarArgs {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Input string values");
        System.out.println(concatenateStr(input.nextLine()));
        System.out.println(concatenateStr("Bro", "I", "am", "hungry..."));

//        System.out.println("OUTPUT: ");
//        System.out.println(concatenateStr());

    }

    public static String concatenateStr(String... elements){// yha elements ka ek array ban gya h
        StringBuilder sb= new StringBuilder();
        for (String ele: elements){
            sb.append(ele).append(" ");
        }
        return sb.toString();
    }
}
