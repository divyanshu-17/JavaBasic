package in.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetLearn {
    public static void main(String[] args) {
        Set<String> names= new HashSet<>();

        System.out.println(names.add("Dibu"));
        System.out.println(names.add("Piru"));
        System.out.println(names.add("Aryan"));

        for(String n : names){
            System.out.printf("%s \n",n);
        }

        System.out.println("Can I again add the same name?: "+names.add("Dibu"));

        System.out.println("Size of set: "+names.size());
        for(String n : names){
            System.out.printf("%s \n",n);
        }

        System.out.println(names.contains("Dibu"));

        System.out.println(names.remove("Dibu"));

        System.out.println("Does set have the removed element?: "+names.contains("Dibu"));
    }
}
