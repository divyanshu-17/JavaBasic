package in.Practice.exception;

public class TempTest {
    public static void checkTemperature(double degrees) throws CustomTemperatureException {
        if (degrees > 100 || degrees < 0) {
            throw new CustomTemperatureException(degrees); // fires your custom exception and creates an object of
        }                                                   // that class
        System.out.println("Temperature is normal");
    }

    public static void main(String[] args) {
        try {
            checkTemperature(150.0);
        } catch (CustomTemperatureException e) {
            System.out.println(e.getMessage()); // "The temperature (150.0 C) isn't in normal range."
            System.out.println(e.getDegrees()); // 150.0
        }
    }
}
//Checked Exception
//Java forces you to handle it at compile time — your code won't even compile without handling it.
//java// ❌ won't compile without try-catch or throws
//FileReader reader = new FileReader("file.txt");
//java// ✅ must handle it
//try {
//FileReader reader = new FileReader("file.txt");
//} catch (IOException e) {
//        System.out.println("Handle it!");
//}
//These are things that could reasonably go wrong that Java wants you to plan for — file not found, network down etc.
//
//        Unchecked Exception
//Java doesn't force you to handle it — code compiles fine, but crashes at runtime if it happens.
