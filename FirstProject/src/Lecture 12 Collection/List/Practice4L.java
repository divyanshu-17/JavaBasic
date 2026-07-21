package in.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice4L {
//    Reverse an ArrayList without using:
//            Collections.reverse()
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> num= new ArrayList<>();

        System.out.println("Give 5 nos"); //1️⃣
        for (int i = 0; i < 5; i++) {
            num.add(input.nextInt());
        }
        for (int i = 0; i < num.size()/2; i++) {
            int swap=num.get(i);

            num.set(i, num.get(num.size()-1-i));

            num.set(num.size()-1-i, swap);
        }
        System.out.println("Reversed of ArrayList is: "+num);
    }
}

//Other ways to take input:
//2️⃣ArrayList<Integer> list = new ArrayList<>();
//
//char choice;
//
//do{
//        System.out.print("Enter number: ");
//    list.add(input.nextInt());
//
//        System.out.print("Add another? (y/n): ");
//choice = input.next().charAt(0);
//
//}while(choice == 'y' || choice == 'Y');
//
//        System.out.println(list);


//3️⃣ArrayList<Integer> list = new ArrayList<>();
//
//System.out.println("Enter numbers (-1 to stop)");
//
//while(true){
//
//    int num = input.nextInt();
//
//    if(num == -1){
//        break;
//    }
//
//    list.add(num);
//}
//
//System.out.println(list);