package in.Abstra.Vehicle;

public abstract class VehicleAb implements Transport { //‼️By adding abstract this class can only be inherited by child by can't be made object
    // implements just means extends for INTERFACE

    private  int noOfTyres;

    public abstract void startSound(); // This can't be inherited and can only be accessed by defining it in the child
    // class.    We can do this also: public abstract int sum(int no1, int no2);

    public VehicleAb(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public int getNoOfTyres() {
        return noOfTyres;
    }

    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public void commute(){
        System.out.println("Going......");
    }

//    @Override  ‼️we can either define it here or in child as this is an abstract class we can skip this responsibility
//    public void getSetGo() {
//        System.out.println("Going to place...");
//    }
}
