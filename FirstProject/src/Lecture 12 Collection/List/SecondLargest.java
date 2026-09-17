package in.List;

import java.util.ArrayList;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> arr= new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(3);
        arr.add(7);
        arr.add(3);
        arr.add(7);
        arr.add(17);

//        arr.add(-5);
//        arr.add(-2);
//        arr.add(-7);
//        arr.add(-3);
//        arr.add(-7);           Output: -3

        System.out.println("All the elements:");
        int secondLargestNo= secondLargest(arr);
        for (int i : arr){
            System.out.println(i);
        }
        System.out.println("Second Largest ele: "+secondLargestNo);
    }
    public static int secondLargest(List<Integer> arrayGiven){
        int largest=Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;

        for (int i = 0; i < arrayGiven.size(); i++) {
            if (arrayGiven.get(i)>largest){
                secondLargest=largest;
                largest=arrayGiven.get(i);
                //arrayGiven.get(i)<largest && arrayGiven.get(i)>secondLargest
            } else if (arrayGiven.get(i) > secondLargest && arrayGiven.get(i) != largest) {
                secondLargest=arrayGiven.get(i);
            }
        }
        return secondLargest;
    }

}
