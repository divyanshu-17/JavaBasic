package in.List;

import java.util.List;

public class ArrayList<I extends Number> {
    public static void main(String[] args) {
        List<String> strList = new java.util.ArrayList<>(); //‼️‼️We add here wrapper Integer not int, and <> <-this is
        //GENERICS and generics are compile time

        strList.add("Divyanshu");
        strList.add("Ranjan");
        //strList.add(54);
        for (int i = 0; i < strList.size(); i++) { //👍for output we use normal loop or for each loop like array
            // There is no fixed length. So Java doesn't expose a public variable called length.
            System.out.println("1st one "+strList.get(i));
        }

        strList.add(1,"Singh");

        if (strList.contains("Ranjan")){
            System.out.println("Yes at index: "+strList.indexOf("Ranjan"));
        }else if  (strList.contains("divyanshu")) { //D nhi h to bhi same nhi manega
            System.out.println("yes");
        }

        for (String str : strList){ //👍output using for-each loop like array
            System.out.println(str);
        }

        strList.remove(2);

        for (int i = 0; i < strList.size(); i++) {
            System.out.println("3rd one "+strList.get(i));
        }
        System.out.println(strList.reversed());

    }
}
