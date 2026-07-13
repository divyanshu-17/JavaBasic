package Refrence.Relation;

public class CarP extends VehicleP{

    public CarP(String whichVeh) {
        super("Wagoner");
    }

    private int noOfWheels;

    public CarP(String whichVeh, int noOfWheels) {
        super(whichVeh);
        this.noOfWheels = noOfWheels;
    }

    public int etNoOfWheels(){
        return noOfWheels;
    }

}
