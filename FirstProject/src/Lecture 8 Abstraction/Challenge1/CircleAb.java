package in.Abstra.Challenge1;

public class CircleAb extends ShapeAb{

    private int radius;

    // We can also add constructor to get radius

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    protected double calcArea() {
       double areaOfCir= Math.PI*Math.pow(radius,2);
       return areaOfCir;
    }
}
