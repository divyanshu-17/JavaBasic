package in.Map;

import java.util.*;

// With custom comparator
public class TreeMapStudent {
    int rollno;
    String name, address;

    public TreeMapStudent(int rollno, String name, String address){

        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String toString(){

        return this.rollno + " " + this.name + " "
                + this.address;
    }
}
// Comparator class
class SortByRoll implements Comparator<TreeMapStudent> {

    public int compare(TreeMapStudent a, TreeMapStudent b){

        // Compare based on roll number
        return a.rollno - b.rollno;
    }
}

class Geeks{
    public static void main(String[] args) {

        // Create a TreeMap using a Comparator
        TreeMap<TreeMapStudent, Integer> tm
                = new TreeMap<>(new SortByRoll());

        tm.put(new TreeMapStudent(111, "Geek1", "New York"), 1);
        tm.put(new TreeMapStudent(131, "Geek2", "London"), 2);
        tm.put(new TreeMapStudent(121, "Geek3", "Paris"), 3);

        System.out.println("TreeMap sorted by roll number: "
                + tm);
    }
}