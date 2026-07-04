package ConceptWalaFolder.PackageTesting;

public class AccessModifierPublic {
    // Again we will take car class as example
    public String color;
    public String model;
    private double fuelLevel;
    private long rate;

    public AccessModifierPublic(){

    }

    public AccessModifierPublic(String color, String model, double fuelLevel, long rate) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "AccessModifierPublic{" + "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", rate=" + rate +
                '}';

    }

}
