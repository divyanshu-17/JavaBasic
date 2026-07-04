package School;

public class Student {
    private String name;
    private int marks;
    private char grade;

    public Student(String name, int marks) {
        this.name = name;
        setMarks(marks); // reuse setter so grade is calculated immediately
    }

    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks!");
            return;
        }
        this.marks = marks;
        calculateGrade();
    }

    private void calculateGrade() { // private - only this class can call it
        if (marks >= 90) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 50) grade = 'C';
        else grade = 'F';
    }

    public int getMarks() {
        return marks;
    }

    public char getGrade() {
        return grade;
    }
}