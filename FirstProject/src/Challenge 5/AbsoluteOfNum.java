import java.util.Scanner;

public class AbsoluteOfNum { //means +ve no +ve aur -ve no ko +ve krta h |-9|=9
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Type no ");
        int no= input.nextInt();
        int absolute= no >= 0 ? no : no*-1; // or-> no : -no
        System.out.println("Absolute no is "+absolute);
    }
}
