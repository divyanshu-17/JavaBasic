package in.Practice.exception;
// ‼️We can only use this in this package and to use it in any other package we have to import it
// import in.Practice.exception.CustomTemperatureException; ❌ If the class isn't public, only classes in
//                                                                            the same package can use it.
public class CustomTemperatureException extends Exception {
    private double degrees;

    public CustomTemperatureException(double degrees){
        this.degrees=degrees;
    }

    @Override
    public String getMessage(){
        return "The temperature (" + degrees + " C) isn't in normal range.";
    }
    public double getDegrees(){
        return degrees;
    }
}

//What extends Exception gives you

//Because your class extends Exception, it automatically inherits methods like:

//printStackTrace();
//getMessage();
//getCause();
//toString();

//You overrode only one:

//@Override
//public String getMessage() {
//    return "The temperature (" + degrees + " C) isn't in normal range.";
//}

//Now, whenever someone calls:

//        exception.getMessage();

//on a CustomTemperatureException object, your version runs instead of the one inherited from Exception.