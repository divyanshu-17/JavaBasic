import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Checking bigger no OLD WAYS");
        System.out.println("Type no1 ");
        int no1= input.nextInt();
        System.out.println("Type no2 ");
        int no2= input.nextInt();
        System.out.println("Which operation you want on your nos: add, sub, mul, div? ");
        String op= input.next();

        int result= switch (op){
            case "add" -> no1+no2;
            case "min" -> no1-no2;
            case "mul" -> no1*no2;
            case "div" -> no1/no2;
            default -> 0;
        };
        System.out.println("Output= "+result);
    }
}
