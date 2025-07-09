import java.util.Scanner;

public class MaxMinEle {
    public static void main(String[] args) {
        System.out.print("We'll find out the max and min no from the array\n");
        int[] myArr= ArrayUtilityForInput.inputArray();
        int maximum= max(myArr);    //❤️Learn about Integer.MAX_VALUE;
        int minimum= min(myArr);    //❤️Learn about Integer.MIN_VALUE;
        System.out.println("The minimum of the Array is:" + minimum);
        System.out.println("The maximum of the Array is:" + maximum);
    }
    public static int max(int[] myArr){
        if(myArr.length==0){
            return Integer.MAX_VALUE;
        }
        int max=myArr[0];
        int i=1;
        while (i<myArr.length){
            if (max< myArr[i]){
                max=myArr[i];
            }
            i++;
        }
        return max;
    }

    public static int min(int[] myArr){
        int min= Integer.MAX_VALUE;
        int i=0;
        while (i<myArr.length){
            if (min>myArr[i]){
                min=myArr[i];
            }
            i++;
        }
        return min;
    }
}
