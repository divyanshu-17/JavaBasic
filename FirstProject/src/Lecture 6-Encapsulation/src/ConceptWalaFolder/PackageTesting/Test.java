package ConceptWalaFolder.PackageTesting;

public class Test {
    public static void main(String[] args) {
        AccessModifierPublic car= new AccessModifierPublic();
        car.color="red";
        System.out.println(car);

        AccessModifierPublic newCar= new AccessModifierPublic("Black","BMW T1",5,5900000);

    }
}
