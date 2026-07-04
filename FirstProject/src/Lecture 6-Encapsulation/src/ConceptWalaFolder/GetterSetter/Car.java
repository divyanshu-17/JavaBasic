package ConceptWalaFolder.GetterSetter;

public class Car {
    private String color;  // Suppose ye Public Chahiye to hum inke method bnaenge uss access mod k sath
    private String model; // Public
    private double fuelLevel;
    private long rate; // Default

    public Car(String color,String model, double fuelLevel, long rate){
        this.color=color;
        this.model=model;
        this.fuelLevel=fuelLevel;
        this.rate=rate;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        if (color.equals("Yellow")){
            System.out.println("Chi! AAAA Thu!");
        }else {
            this.color = color;
        }
    }

     public String getModel(){
        return model;
     }
}
