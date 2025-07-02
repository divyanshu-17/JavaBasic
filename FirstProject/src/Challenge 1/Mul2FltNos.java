import java.util.Scanner;

public class Mul2FltNos {
    public static void main(String[] args) {
        Scanner No= new Scanner(System.in);
        System.out.print("Please enter your 1st no: ");
        float No1= No.nextFloat();
        System.out.print("Please enter your 2nd no: ");
        float No2= No.nextFloat();
        float Mul= No1*No2;
        System.out.println("Multiply is: "+Mul );
    }
}
