package vehicle;

public class Driver {

    static int minDrivingAge=18; // static use kr k hum bina object bnae acces kr skte h

    String name;
    String dateOfLisence;  // Ine lie object bnana padega
    public static void main(String[] args) {
     /*   car myCar= new car();
        myCar.addFuel(5);
        myCar.start();                    1. Does the same thing
        myCar.drive();
        System.out.println(myCar.currentFuelInLiters + " ltrs remaining");
        myCar.drive();
        System.out.println(myCar.currentFuelInLiters + " ltrs remaining"); */

        Car againMyCar=new Car(3);
        againMyCar.addFuel(7);                // 3. Does the same thing
        againMyCar.start().drive();

       // car gonnaStartCar=againMyCar.start();
       // againMyCar.drive();                   2. Does the same thing

        Driver myDriver= new Driver();
        myDriver.dateOfLisence=("12-05-2022");

        System.out.println(minDrivingAge);
        System.out.println(againMyCar.colour); //This will give the default value 'black'
    }
}
