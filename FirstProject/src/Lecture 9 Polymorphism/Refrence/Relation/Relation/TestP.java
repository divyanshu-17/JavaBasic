package Refrence.Relation;

public class TestP {
    public static void main(String[] args) {
        VehicleP veh = new VehicleP("Kia");
        CarP car= new CarP("GG",4);
        VehicleP cVeh = new CarP("Swift");
        // we can make obj of car here because it's a child of vehicle

        caseTest(veh);
        caseTest(car); // we have to give vehicle so it's child will do too
    }
    private static void caseTest(VehicleP veh){
        veh.start();
    }
}
