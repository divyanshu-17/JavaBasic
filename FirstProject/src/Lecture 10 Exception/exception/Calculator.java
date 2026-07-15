package in.Practice.exception;
// We do exception handling so that our code doesn't fully stop on exception(human error in code)
// We can add different exception conditions in catch to tell us which one occurred in our code in try
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Division Calc");
        System.out.print("Please enter your first no ");
        int first= input.nextInt();
        System.out.print("Please enter your second no ");
        int second= input.nextInt();

        try {
            int a[] = new int[5];
            System.out.printf("Result is %d", a[6]);
            int division= first/second;
            System.out.printf("Result is %d\n", division);
        }catch (ArithmeticException exception){
            System.out.printf("%s Please enter valid values ", exception.getCause());
                                    // .getCause() predefined, gives reason for the error
        }catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Array out of bound.");
        }catch (Exception e){
            System.out.print("Last exception");
            throw e;

        } // in last catch we put most senior class exception Exception⬆️Throwable⬆️Object to catch any and every exception
        finally {
            System.out.println("I am in finally!"); //finally throw catch chle na chale ye to chalega
        }

    }
}
