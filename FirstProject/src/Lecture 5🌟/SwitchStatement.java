import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("Which Day?");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no between 1-7");
        int day= input.nextInt();
        oldSwitch(day);
        newSwitch(day);

    }

    public static void oldSwitch(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day no");
        }
    }

    public static void newSwitch(int day){
        String DayStr= switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6,7 -> "Holiday";
            default -> "Invalid day";
        };
        System.out.println(DayStr);
    }
}
