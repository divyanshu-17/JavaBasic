package in.Practice.exception;

import java.util.Scanner;

public class ChallengeException {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("1st no: ");
        int a= inp.nextInt();
        System.out.println("2nd no: ");
        int b= inp.nextInt();

//        try {                                   My way~
//            int div= a/b;
//        } catch (ArithmeticException e) {
//            System.out.println("You can't divide by zero you fool! "+e);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            System.out.println("-----------------------Code end-----------------------");
//        }
        try {
            int result = a / b;
            System.out.printf("Result is %d\n", result);
        } catch (ArithmeticException exception) {
            if (exception.getMessage()
                    .equals("/ by zero")) {
                System.out.println("Divide by zero occurred.");
            } else {
                throw exception;
            }
        }finally {
            System.out.println("-----------------------Code end-----------------------");
        }
    }
}
