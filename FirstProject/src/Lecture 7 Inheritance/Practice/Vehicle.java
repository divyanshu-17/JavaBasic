package Practice;

public class Vehicle {

    protected int numberOfTires;

    public void setNumberOfTires(int numberOfTires) { // iski zarurat tab padegi jab private hota noOfVeh
        this.numberOfTires = numberOfTires;
    }

    @Override
    public String toString() {
        return "Vehicle no of tires: " + numberOfTires;
    }

    public void commute() {
        System.out.printf("I am going from place A to place B using %d tires\n", numberOfTires);
    }
}
