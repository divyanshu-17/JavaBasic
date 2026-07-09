package in.Abstra.Vehicle;

public class TestAb {
    public static void main(String[] args) {
        CarAb car = new CarAb();
       // VehicleAb veh= new VehicleAb(); ‼️error cause now it's an abstract class‼️
        car.commute(); //We can access Vehicle but only through Car(child) class.

        car.startSound();
    }
}
