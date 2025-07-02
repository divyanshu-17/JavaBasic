import java.util.Scanner;

public class BitOr {
    public static void main(String[] args) {

        Scanner Bit_or= new Scanner(System.in);
        System.out.println("First no: ");
        int one=Bit_or.nextInt();
        System.out.println("second no: ");
        int two=Bit_or.nextInt();

        int c;
        c= one|two;
        System.out.println("Bitwise Or of two nos is: "+c);
    }
}
