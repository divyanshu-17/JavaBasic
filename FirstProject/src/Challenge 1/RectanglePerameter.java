import java.sql.SQLOutput;
import java.util.Scanner;

public class RectanglePerameter {
    public static void main(String[] args) {
        System.out.println("***We are going to calculate the perimeter of Rectangle***");
        Scanner Perim= new Scanner(System.in);
        System.out.println("Please enter length: ");
        float length= Perim.nextFloat();
        System.out.println("Please enter width: ");
        float width= Perim.nextFloat();
        float Perimeter= (2*(length))+(2*(width));
        System.out.println("The perimeter of Rectangle is: "+Perimeter);

    }
}
