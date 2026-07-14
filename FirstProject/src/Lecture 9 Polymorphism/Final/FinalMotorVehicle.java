package Final;
// Almost every vehicle have motor so this is parent of even vehicle

public final class FinalMotorVehicle {
    // When we made this a final class it can't be inherited anymore.
    public void motorRunning(){
        System.out.println("Motor start...");
    }
}
