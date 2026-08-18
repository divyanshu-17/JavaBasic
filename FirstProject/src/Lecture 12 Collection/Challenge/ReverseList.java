package in.Challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseList {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> aList= new ArrayList<>();

        System.out.println("ele.s req: ");
        int req= input.nextInt();
        System.out.println("Please enter elements: ");
        for (int i = 0; i < req; i++) {
            aList.add(input.nextInt());
        }

        System.out.println("List Before: "+aList);
        reverseList(aList);
        System.out.println("List After: "+aList);
    }

    public static void reverseList(List<Integer> listToRev) {
        int left = 0;
        int right = listToRev.size() - 1;

        while (left < right) {
            int temp = listToRev.get(left);
            listToRev.set(left, listToRev.get(right));
            listToRev.set(right, temp);
            left++;
            right--;
        }
    }
}
