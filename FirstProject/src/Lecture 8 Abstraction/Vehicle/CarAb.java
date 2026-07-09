package in.Abstra.Vehicle;

public class CarAb extends VehicleAb {
    private int noOfDoors;

    public CarAb(){
        super(4);
    }
    @Override
    public void startSound(){
        System.out.println("Vroom....");
    }

    @Override
    public void getSetGo() {
        System.out.println("Going to place...");
    }
}
