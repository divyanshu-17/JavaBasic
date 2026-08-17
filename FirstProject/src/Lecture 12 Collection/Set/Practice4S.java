package in.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice4S {
//Two Sets:
//Set A:
//1 2 3 4 5
//Set B:
//3 4 5 6 7
//Find:
//Union
//Intersection
//Difference (A − B)

    static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        Set<Integer> setInput1 = new HashSet<>();
        Set<Integer> setInput2= new HashSet<>();
        Set<Integer> union= new HashSet<>();
        Set<Integer> intersection= new HashSet<>();
        Set<Integer> difference= new HashSet<>();

        System.out.println("Taking input for set1");
        setInput1=inputEle(setInput1);
        System.out.println("Taking input for set2");
        setInput2=inputEle(setInput2);


        System.out.println("For union putting in sets");
        union=Union(setInput1,setInput2,union);

        System.out.println("For intersection putting in sets");
        intersection=Intersection(setInput1,setInput2,intersection);

        System.out.println("For difference putting in sets");
        difference=Difference(setInput1,setInput2,difference);


        System.out.println("After union of sets: ");
        for (int i : union){
            System.out.println(i);
        }
        System.out.println("After intersection of sets: ");
        for (int j : intersection){
            System.out.println(j);
        }
        System.out.println("After difference of sets: ");
        for (int k : difference){
            System.out.println(k);
        }


    }

    public static Set<Integer> inputEle(Set<Integer> given){
        System.out.println("No ele.s you want in set?: ");
        int noOfEle= input.nextInt();

        System.out.println("Feed "+noOfEle+" ele.s in HashSet");
        for (int i = 0; i < noOfEle; i++) {
            given.add(input.nextInt());
        }
        return given;
    }

    public static Set<Integer> Union(Set<Integer> set1,Set<Integer> set2,Set<Integer> unionSet){
        for (int i : set1){
            unionSet.add(i);
        }
        for (int j : set2){
            unionSet.add(j);
        }
        return unionSet;
    }

    public static Set<Integer> Intersection(Set<Integer> set1,Set<Integer> set2,Set<Integer> intersectionSet){
        Set<Integer> common = new HashSet<>();
        for (int i : set1){
            if (!intersectionSet.add(i)){
                common.add(i);
            }
        }
        for (int j : set2) {
            if (!intersectionSet.add(j)) {
                common.add(j);
            }
        }
        return common;
    }
    public static Set<Integer> Difference(Set<Integer> set1,Set<Integer> set2,Set<Integer> differenceSet){
        for (int i : set1){
            if (!differenceSet.add(i)){
                differenceSet.remove(i);
            }
        }
        for (int j : set2) {
            if (!differenceSet.add(j)) {
                differenceSet.remove(j);
            }
        }
        return differenceSet;
    }

}
