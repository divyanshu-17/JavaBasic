import java.util.Scanner;

public class TriAr {
    public static void main(String[] args) {
        System.out.println("We are going to calculate the area of Triangle");
        Scanner TriA= new Scanner(System.in);
        System.out.println("Please enter Height: ");
        float height= TriA.nextFloat();
        System.out.println("Please enter Base: ");
        float base= TriA.nextFloat();
        float Area= 0.5f*base*height;
        System.out.println("Area of Triangle is: "+ Area);
    }
}
