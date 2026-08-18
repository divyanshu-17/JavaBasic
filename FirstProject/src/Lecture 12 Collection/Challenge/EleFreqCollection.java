package in.Challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EleFreqCollection {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        List<Integer> frequencyOfEle= new ArrayList<>();

        System.out.println("How many ele.s you want to add?: ");
        int noOfInput= input.nextInt();

        System.out.println("Enter your ele.s ");
        for (int i = noOfInput; i >0; i--) {
            int addInput = input.nextInt();
            Collections.addAll(frequencyOfEle, addInput);
        }
        System.out.println("List is sorted! ");
        Collections.sort(frequencyOfEle);

        for (int i: frequencyOfEle) {
            System.out.println("Ele.s: "+i);
            System.out.println("Frequency: "+Collections.frequency(frequencyOfEle, i));
        }
    }
}
//What is Binary Search?
//Binary Search is a searching algorithm that finds an element by repeatedly dividing the search space in half.
//Instead of checking every element one by one (like linear search), it compares with the middle element.
//Example
//Suppose you have:
//10 20 30 40 50 60 7
//Want to find 50.
//Middle = 40
//50 > 40, so ignore the left half.
//Remaining:
//50 60 70
//Middle = 60
//50 < 60, so ignore the right half.
//Remaining:
//50
//Found!
//Instead of checking 7 elements, it found it in 3 comparisons.