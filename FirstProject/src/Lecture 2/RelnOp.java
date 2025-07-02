import java.util.Scanner;

public class RelnOp {
    public static void main(String[] args) {
        Scanner DL=new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age=DL.nextInt();

        if (age>=18){
            System.out.println("You are eligible for drivers licenses");

        }else {
            System.out.println("Not eligible");
        }
    }
}
