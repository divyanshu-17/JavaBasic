package in.Challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomComparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear", "Zebra", "Aana","Lion", "Ant");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);
    }

    public static void sortInDescending(List<String> stringList) {
        Collections.sort(stringList, new java.util.Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                if (s.equals(t1)) {
                    return 0;// 0 beech me aaega
                } else if (s.charAt(0) < t1.charAt(0)) {
                    return 1;// t1 baad me aeega
                } else {
                    return -1; // yani 1st wala wo pehle aaega
                }
            }
        });
    }
}
