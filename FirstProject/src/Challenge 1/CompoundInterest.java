import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner CI=new Scanner(System.in);
        System.out.println("We are going to calculate Compound Interest ");
        System.out.print("Please enter Principal: ");
        float P= CI.nextFloat();
        System.out.print("Please enter Rate: ");
        float R= CI.nextFloat();
        System.out.print("Please enter Time: ");
        float T= CI.nextFloat();
        float CICal=P*(1+R/100)*T;
        System.out.println("Calculated CI is: "+CICal);
    }
}
