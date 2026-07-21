package in.CollectionsClass;
//Collection is the parent interface class

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DifferentThanCollection {
    public static void main(String[] args) {
        List<Integer> numList= new ArrayList<>();
        numList.add(5);
        numList.add(2);
        numList.add(11);
        numList.add(51);
        numList.add(-999);

        System.out.println("Before sorting: ");
        for (int no : numList){
            System.out.printf("%d ",no);
        }
        System.out.println();

        Collections.sort(numList);
        System.out.println("After sorting: ");
        for (int no : numList){
            System.out.printf("%d ",no);
        }
        System.out.println();

        Collections.reverse(numList);
        System.out.println("After reversing: ");
        for (int no : numList){
            System.out.printf("%d ",no);
        }
        System.out.println();

        Collections.shuffle(numList);
        System.out.println("After shuffling: ");
        for (int no : numList){
            System.out.printf("%d ",no);
        }
        System.out.println();

        Collections.addAll(numList,55,78,27); // Adds multiple elements

        int max= Collections.max(numList);
        int min= Collections.min(numList);

        System.out.println("Max no: "+max);
        System.out.println("Min no: "+min);

        List<Integer> unmodifiable= Collections.unmodifiableList(numList); //meri numList ko leke ek dusri list bna do
        // jo ki unmodifiable ho!
//        unmodifiable.add(8); Exception
    }
}
