import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        Greet();

        System.out.println("1st Phase");

        int no1= UserNo();
        int no2= UserNo();

        System.out.println("2nd Phase");

        int no3= UserNo()+2;
        int no4= UserNo()+4;

        int sum=no1+no2;
        System.out.println("Sum of Phase1 nos are ~ "+sum);

        int sum2=no3+no4;
        System.out.println("Sum of Phase2 nos are ~ "+sum2);
    }

    public static void Greet(){
        System.out.println("Hello Welcome~ \n");
    }

    public static int UserNo(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a no: ");
        int number= input.nextInt();
        return number;
    }
}
