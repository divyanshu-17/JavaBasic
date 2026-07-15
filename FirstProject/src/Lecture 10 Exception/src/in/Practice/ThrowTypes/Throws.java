package in.Practice.ThrowTypes;
// Throws is used to declare an exception
public class Throws {
    public static void readFile() throws Exception { // just a warning to caller
        System.out.println("Reading file...");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
