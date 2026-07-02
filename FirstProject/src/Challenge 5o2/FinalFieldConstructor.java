public class FinalFieldConstructor {
    final int noOfWheels;
    final String model;
    final int year;

    public FinalFieldConstructor(String model,int year,int noOfWheels){
        this.model=model;
        this.year=year;
        this.noOfWheels=noOfWheels;
    }

    @Override
    public String toString() {
        return "{Model: "+model+" , Year: "+year+" , No of Wheels: "+noOfWheels+"}";
    }

    public static void main(String[] args) {
        FinalFieldConstructor boo= new FinalFieldConstructor("urt007",2020,8);
        System.out.println("My car's features are~ "+boo);
    }
}
