import java.util.Scanner;

public class LogicOp {
    public static void main(String[] args) {
        /*Age < 5= 75%
        Age> 60= 25%
        Female= 50% */
        Scanner Disc= new Scanner(System.in);
        System.out.println("Welcome to ticket discount calculator");
        System.out.print("Please enter your age: ");
        int Age= Disc.nextInt();
        System.out.println("Are you a Female? , (True/False)");
        boolean isFemale= Disc.nextBoolean();

        if (Age<5) {
            System.out.println("You get 75% Discount");

        } else if (isFemale) {
            System.out.println("You get 50% Discount");

        } else if (Age>60 && !isFemale) {
            System.out.println("You get 25% Discount");

        }else {
            System.out.println("You get no Discount");
        }
    }
}


