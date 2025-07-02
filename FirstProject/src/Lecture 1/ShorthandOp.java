import java.util.Scanner;

public class ShorthandOp {
    public static void main(String[] args) {
        int a= 5;
        Scanner input= new Scanner(System.in);
        System.out.print("1st: ");
        int b= input.nextInt();
        a=a+b;
        System.out.println("Sum of a+b: " +a);
        System.out.print("2nd: ");
        int c= input.nextInt();
        a=a+c;
        System.out.println("Sum of b+c: " +a);
        System.out.print("3rd: ");
        int d= input.nextInt();
        a=a+d;
        System.out.println("Sum of c+d: " +a);

        System.out.println("****This is before using SHORTHAND OPERATOR****");

        int e = 5;
        System.out.print("1st: ");
        int f= input.nextInt();
        e+=f;
        System.out.println("Sum of e+f: " +e);
        System.out.print("2nd: ");
        int g= input.nextInt();
        e+=g;
        System.out.println("Sum of f+g: " +e);
        System.out.print("3rd: ");
        int h= input.nextInt();
        e+=h;
        System.out.println("Sum of g+h: " +e);

        System.out.println("****This is after using SHORTHAND OPERATOR****");
    }
}
