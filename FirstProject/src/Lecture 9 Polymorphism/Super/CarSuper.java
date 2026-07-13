package Super;
// With super we can access methods and constructor of parent class
public class CarSuper extends VehicleSuper{
    CarSuper(int noOfTyres){
        super(noOfTyres);
    }


    @Override
    public void start() {
        System.out.println(super.getNoOfTyres());
        System.out.println("Starting...");
    }
}
