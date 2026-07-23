package in.Queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Practice1Q {
//Take 10 integers from the user.
//Store them in a Queue.
//Print all elements in the same order.
//Example
//Input 10 20 30
//Output 10 20 30
    static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        Queue<Integer> numQueue= new LinkedList<>();

        System.out.println("Enter 10 elements you want to inset in Queue: ");
        for (int i = 0; i < 10; i++) {
            numQueue.add(input.nextInt());
        }
//  Or Collections.addAll(numQueue,5,4,7,9,12,6,4,17,6,11);

        for (Integer i : numQueue) {
            System.out.printf("%d \n",i);
        }


    }
}
