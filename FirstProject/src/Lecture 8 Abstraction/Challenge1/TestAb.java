package in.Abstra.Challenge1;

public class TestAb {
    public static void main(String[] args) {
        CircleAb circle= new CircleAb();
        SquareAb square = new SquareAb();

        circle.setRadius(5);
        square.setSide(5);

        System.out.println(circle.getRadius());
        System.out.println( square.getSide());

        System.out.println(circle.calcArea());
        System.out.println(square.calcArea());
    }
}
