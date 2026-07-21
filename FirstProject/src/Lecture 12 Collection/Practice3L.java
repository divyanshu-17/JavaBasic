package in.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice3L {
//    Take 10 integers.
//    Remove all even numbers from the ArrayList.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Integer> arl= new ArrayList<>();

        System.out.println("Please enter 10 elements: ");
        for (int i = 0; i < 10; i++) {
            arl.add(input.nextInt());
        }

//        for (int even : arl){
//            if (even%2==0){
//                arl.remove(even);
//            }
//            System.out.println("Remaining odd nos: "+even);
//           ‼️ A for-each loop is only meant for reading elements.
//            If you modify the ArrayList (add/remove elements) while iterating with a for-each loop, Java throws a:
//            ‼️ConcurrentModificationException because the loop expects the collection to stay unchanged while it's iterating.
//        }

        for (int i=arl.size()-1;i>=0;i--){
            //👽Why Backward: Since you're moving from the end toward the beginning, shifting elements doesn't
            // affect the indices you haven't visited yet.

            if (arl.get(i)%2==0){
                arl.remove(i);
            }
        }
        System.out.println("Remaining odd elements= "+arl);
    }
}
//Mistake 2: remove(even) doesn't do what you think arl is:

//List<Integer> arl = new ArrayList<>();

//When you write: arl.remove(even);

//Java sees even as an int.

//ArrayList has two remove() methods:

//remove(int index)

//and

//remove(Object obj)

//Since even is an int, Java chooses:

//remove(int index)

//Suppose your list is:

//        [1, 2, 3, 4, 5]

//When even = 2

//you expect:

//remove value 2

//But Java does:

//remove element at index 2

//which removes:

//        3

//Wrong!