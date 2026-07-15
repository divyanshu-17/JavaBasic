package in.Practice.ThrowTypes;
// Throw is used to actually throw or use the exception
public class Throw {
    public static void main(String[] args) {
        int age = -5;
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!"); // fires immediately
        }
        System.out.println("Age is: " + age);
    }
}


