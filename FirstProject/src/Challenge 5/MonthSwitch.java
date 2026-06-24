import java.util.Scanner;

public class MonthSwitch {
    public static void main(String[] args) {
        System.out.println("Which Month?");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no between 1-12 ");
        int monthGiven= input.nextInt();

        MonthSwitch whichMonth= new MonthSwitch();
        whichMonth.month(monthGiven);

    }
    public void month(int Month) {
        String DayStr = switch (Month) {
            case 1 -> "jan";
            case 2 -> "feb";
            case 3 -> "mar";
            case 4 -> "apr";
            case 5 -> "may";
            case 6 -> "june";
            case 7 -> "july";
            case 8 -> "aug";
            case 9 -> "sep";
            case 10 -> "oct";
            case 11 -> "nov";
            case 12 -> "dec";
            default -> "Invalid Month";
        };
        System.out.println(DayStr);
    }
}
