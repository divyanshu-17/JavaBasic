package ConceptWalaFolder.TestingAgain;

import ConceptWalaFolder.GetterSetter.Car;

public class GetterTest {
    public static void main(String[] args) {
        Car car = new Car("Green", "Helix", 7, 4800000);
        System.out.printf("%s %s ",car.getColor(),car.getModel());

    }
}
