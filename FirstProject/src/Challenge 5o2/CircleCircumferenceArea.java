import java.util.Scanner;

public class CircleCircumferenceArea {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Let's calculate area and circumference of a circle");
        System.out.print("Give radius: ");
        double radius= input.nextDouble();

        // double area= Math.PI(Math.pow(radius,2));
        double area= Math.PI*Math.pow(radius,2);

        double circumference= 2*Math.PI*radius;

        System.out.printf("Area of circle is %.2f and circumference of circle is %.2f",area,circumference);
    }                                                                  // %.2f up to 2 decimal points
}
