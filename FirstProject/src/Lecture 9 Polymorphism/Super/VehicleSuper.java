package Super;

public abstract class VehicleSuper {
    private int noOfTyres;

    VehicleSuper(){
        this.noOfTyres=0;
    }

    VehicleSuper(int Tyres){
        this.noOfTyres=Tyres;
    }

    public int getNoOfTyres(){
        return this.noOfTyres;
    }

    public abstract void start();
}
