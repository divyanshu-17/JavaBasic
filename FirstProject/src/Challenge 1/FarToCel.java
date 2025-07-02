import java.util.Scanner;

public class FarToCel {
    public static void main(String[] args) {
        System.out.println("We are going to see Celcious yo Farenheight conversion");
        Scanner Cel= new Scanner(System.in);
        System.out.print("Enter temp in Fahrenheit: ");
        float Frt= Cel.nextFloat();
        float Calculation= (Frt-32)*(5f/9);
        System.out.println("Fahrenheit to celcious conversion is "+ Calculation);
    }
}
