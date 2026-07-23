package in.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Practice3Q {
//Take 10 integers.
//Print only the even numbers while keeping the odd numbers in the queue.
//This question teaches you how to process a queue while preserving the elements you want to keep.

    static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("We'll be printing only even nos of the Queue all while keeping odd nos in Queue");

        Queue<Integer> numInQ= new LinkedList<>();
//        Queue<Integer> numInQ2= new LinkedList<>();

        System.out.println("Enter no of ele.s req: ");
        int noOfEle= input.nextInt();

        System.out.println("Enter "+noOfEle+" ele.s: ");
        for (int i = 0; i < noOfEle; i++) {
            numInQ.add(input.nextInt());
        }

        System.out.println("Even ele.s");
        for (int i = 0; i < noOfEle; i++) { //The loop is not checking the queue size. It is checking:noOfEle is
                                             // it will execute that many times.
            int num= numInQ.poll();

            if (num%2==0){
                System.out.println(num);
            }else {
                numInQ.offer(num);
            }
        }
        System.out.println("Remaining ele.s: ");
        System.out.print(numInQ);

//        while (!numInQ.isEmpty()){
//            numInQ2.offer(numInQ.remove());
//        }
//
//        System.out.println("Even ele.s");
//        if (){
//            for (Integer i : numInQ2) {
//                System.out.printf("%d ",i);
//            }
//        }

    }
}
