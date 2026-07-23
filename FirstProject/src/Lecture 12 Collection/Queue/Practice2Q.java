package in.Queue;

import java.util.*;

public class Practice2Q {
// Take N integers.
//Print the queue in reverse order.
// Hint: You cannot access elements by index. Think about another collection that can help.

    static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        Queue<Integer> numsQ= new LinkedList<>();

        System.out.println("How many elements you want: ");
        int noOfEle= input.nextInt();

        System.out.println("Enter "+noOfEle+" elements you want to inset in Queue:");
        for (int i = 0; i < noOfEle; i++) {
            numsQ.add(input.nextInt());
        }

//        Collections.reverse(numsQ); Using collections

//  ‼️‼️ This does not work in ques to reverse queue we use stack and in stack we use queue‼️‼️
//        List<Integer> reverseOfNumsQ= new ArrayList<>();
//
//     👽   for (int i = 0; i < noOfEle; i++) {
//            int a= numsQ.poll();  ‼️‼️not peek() cause it won't remove the element and always return head
//            for (int j = noOfEle; j > 0; j--) { ‼️‼️ can't be solved because I was trying to add and reverse
        // the ele of Q in same loop
//                reverseOfNumsQ.add(a);
//            }
//        }
//        System.out.println("Reverse of given queue is: ");
//        for (int no: reverseOfNumsQ){
//            System.out.println(no);
//        }

        // 1️⃣Move Queue → ArrayList2️⃣Print ArrayList in reverse 3️⃣OR If you want the Queue itself to become reversed
        //After putting everything into the ArrayList, do:
        //for (int i = list.size() - 1; i >= 0; i--) {
        //    numsQ.offer(list.get(i));
        //}

        List<Integer> reverseOfNumsQ = new ArrayList<>();

        while (!numsQ.isEmpty()) {
            reverseOfNumsQ.add(numsQ.poll()); // Instead of writing that whole loop code(👽) we can do this simply
        }

        System.out.println("Reverse of given queue is: ");
        for (int i = noOfEle-1; i >=0 ; i--) {
            System.out.println(reverseOfNumsQ.get(i));
        }
    }
}
