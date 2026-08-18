package in.Challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListSwap {
//    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> aList= new ArrayList<>();

        aList.add(7);
        aList.add(3);
        aList.add(4);
        aList.add(11);
        aList.add(19);

        System.out.println("Before: "+aList);
        swap(aList,0,2);
        System.out.println("After: "+aList);
    }

    public static void swap(List<Integer> swapList, int x,int y){
        int swap= swapList.get(x);
        swapList.set(x,swapList.get(y));
        swapList.set(y,swap);
//        System.out.println("Our list: ");
//        for (int i: swapList){
//            System.out.println(i+ swapList.indexOf(i));
//        }
//        System.out.println("Which ele.s you want to switch give index?: ");
//        for (int i = 0; i < 1; i++) {
//            int ele= input.nextInt();
//            swapList.get(ele);
//
//        }
    }

}
