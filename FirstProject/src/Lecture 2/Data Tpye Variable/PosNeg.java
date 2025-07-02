import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter your No: ");
        int no= input.nextInt();
        
        if(no<0){
            System.out.println("No is negative");
        } else if (no>0) {
            System.out.println("No is Positive");
            
        } else {
            System.out.println("No is 0");
            
        }
    }
}
