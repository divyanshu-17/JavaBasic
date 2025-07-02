import java.util.Scanner;

public class BitLshift {
    public static void main(String[] args) {
        Scanner Bit_LS=new Scanner(System.in);

        System.out.println("No one~ ");
        int one=Bit_LS.nextInt();
        System.out.println("No two~ ");
        int two=Bit_LS.nextInt();

        int c=one<<two;
        System.out.println("Bitwise Left Shift of two nos is: "+c);
    }
}
