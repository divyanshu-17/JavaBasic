import java.util.Scanner;

public class GcD {
    public static void main(String[] args) {
        System.out.println("Let's calculate Greatest Common Divisor");
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter First no: ");
        int a= input.nextInt();
        System.out.print("Please enter Second no: ");
        int b= input.nextInt();
        int c=1;

        if(a>b){
            while (b!=0){
                c=a%b;
                a=b;
                b=c;
                System.out.println("GDC = "+b);
            }
        }
        else if(b>a){
            while (a!=0){
                c=b%a;
                b=a;
                a=c;
                System.out.println("GDC = "+a);
            }
        }
        else{
            System.out.println("Both are same");
        }
    }
}
