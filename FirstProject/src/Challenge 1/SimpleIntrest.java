import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        System.out.println("We are going to claculate simple interest ");
        Scanner SI= new Scanner(System.in);
        System.out.print("Please enter Principal:  ");
        float P= SI.nextFloat();
        System.out.print("Please enter Interest: ");
        float I=SI.nextFloat();
        System.out.print("Please enter Time: ");
        float T= SI.nextFloat();
        double SICal= (P*I*T)/100;
        System.out.println("Calculated Simple Interest is "+SICal);
    }
}
