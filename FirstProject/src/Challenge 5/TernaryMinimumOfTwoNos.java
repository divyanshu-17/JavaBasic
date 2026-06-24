import java.util.Scanner;

public class TernaryMinimumOfTwoNos {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Type no1 ");
        int no1= input.nextInt();
        System.out.print("Type no2 ");
        int no2= input.nextInt();
        int smallerNo = no1<no2?no1:no2;
        System.out.println("Smaller no is: "+smallerNo);
    }
}
