import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type marks: ");
        int marks = input.nextInt();

        String grades= marks>80 ? "High" : (marks>50 ? "Moderate": "Low");
        System.out.println("Your grades are "+grades);
    }
}
