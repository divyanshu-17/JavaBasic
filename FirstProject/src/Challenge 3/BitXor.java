import java.util.Scanner;

public class BitXor {
    public static void main(String[] args) {
        Scanner Bit_Xor= new Scanner(System.in);

        System.out.println("First no: ");
        int one= Bit_Xor.nextInt();
        System.out.println("Second no: ");
        int second= Bit_Xor.nextInt();

        int c=one^second;
        System.out.println("Bitwise XOr of two nos is: "+c);
    }
}
