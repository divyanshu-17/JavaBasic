import java.util.Scanner;

public class BitAnd {
    public static void main(String[] args) {
        Scanner Bit_and= new Scanner(System.in);

        System.out.println("Please enter your first no: " );
       int one= Bit_and.nextInt();
        System.out.println("Enter 2nd no: " );
       int two= Bit_and.nextInt();

       int c= one & two;
        System.out.println("Bitwise And of two nos is "+c);
    }
}
