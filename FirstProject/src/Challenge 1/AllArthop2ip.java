import java.util.Scanner;

public class AllArthop2ip {
    public static void main(String[] args) {
        Scanner Arth=new Scanner(System.in);
        System.out.print("Please enter 1st no: ");
        float No1= Arth.nextFloat();
        System.out.print("Please enter 2nd no: ");
        float No2= Arth.nextFloat();
        System.out.println("Now all Arithmatic operations are +, -, *, /, %");

        float Add= No1+No2;
        System.out.println("Added nos are: "+Add);
        float Sub= No1-No2;
        System.out.println("Subtracted nos are: "+ Sub);
        float Mul= No1*No2;
        System.out.println("Multiply of nos are: "+ Mul);
        float Div= No1/No2;
        System.out.println("Divide of nos are: "+ Div);
        float Mod= No1%No2;
        System.out.println("Modulas of nos are: "+ Mod);
    }
}
