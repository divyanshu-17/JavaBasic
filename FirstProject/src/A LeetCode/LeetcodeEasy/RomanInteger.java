package LeetcodeEasy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanInteger {
    public static void main(String[] args) {
        System.out.println("You have to form roman nos using these keys only:");
        System.out.println("I->1,  V->5,  X->10,  L->50,  C->100,  D->500,  M->1000");
        Scanner input = new Scanner(System.in);
        System.out.print("Give your roman int: ");
        String romanNoStr= input.next();

        int foundNo=findRomanInt(romanNoStr);
        System.out.print("Found no: "+foundNo);
    }
    public static int findRomanInt(String romanNoStr){
        if (romanNoStr.isEmpty()){
            System.out.println("String is empty");
            return -1;
        }
        Map<Character, Integer> val = new HashMap<>();
        val.put('I', 1);
        val.put('V', 5);
        val.put('X', 10);
        val.put('L', 50);
        val.put('C', 100);
        val.put('D', 500);
        val.put('M', 1000);

        if (romanNoStr.length()==1){
            System.out.println("Only 1 char input");
           return val.get(romanNoStr.charAt(0));
        }

        int finalValue=0;
        for (int i = 0; i < romanNoStr.length() - 1; i++) {

            if (val.get(romanNoStr.charAt(i)) < val.get(romanNoStr.charAt(i + 1))) {
                finalValue -= val.get(romanNoStr.charAt(i));
            } else {
                finalValue += val.get(romanNoStr.charAt(i));
            }
        }

        finalValue += val.get(romanNoStr.charAt(romanNoStr.length() - 1));

        return finalValue;
    }
}
//        char temp1;
//        String temp1charV;
//
//        char temp2;
//        String temp2charV;
//
//        int tempNo1;
//        int tempNo2;
//
//        int finalNo=0;
//        int superFinalNo=0;
//        for (int i = 0; i < romanNoStr.length()-1; i++) {
//            for (int j = 1; j < romanNoStr.length(); j++) {
//                temp1=romanNoStr.charAt(i);
//                temp2=romanNoStr.charAt(j);
//
//                temp1charV=String.valueOf(temp1);
//                temp2charV=String.valueOf(temp2);
//
//                System.out.println(temp1charV);
//                tempNo1=Integer.parseInt(temp1charV);
//                tempNo2=Integer.parseInt(temp2charV);
//
//                if (tempNo1>tempNo2 || tempNo1==tempNo2) {
//                    finalNo += tempNo1;
//                } else if (tempNo1<tempNo2) {
//                    finalNo=tempNo2-tempNo1;
//                }
//                superFinalNo=finalNo;
//            }
//        }return superFinalNo;
