package in.Abstra.Challenge1;

public class SquareAb extends ShapeAb{
    private int side;

    // We can also add constructor to get side

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    protected double calcArea() {
        double areaOfSq = Math.pow(side,2);
        return areaOfSq;
    }
}
