package in.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListLearn {
    public static void main(String[] args) {
        // Queue<String> queue= new ArrayList<>()‼️can't do bcoz of dynamic array and we don't want that
       Queue<Integer> queue= new LinkedList<>();

       queue.add(1);
       queue.offer(3);

        for (Integer i : queue) {
            System.out.printf("%d \n",i);
        }

        System.out.println("Head "+queue.peek());
        System.out.println("Head "+queue.element());

        System.out.println("Head element "+queue.remove()+" removed~");
        for (Integer i : queue) {
            System.out.printf("Remaining ele in collection %d \n",i);
        }

        System.out.println("Head element "+queue.poll()+" removed~");
        for (Integer i : queue) {
            System.out.printf("Remaining ele in collection %d \n",i);
        }
//        System.out.println(queue.remove()); error
        System.out.println(queue.poll()); //gives null
    }
}
