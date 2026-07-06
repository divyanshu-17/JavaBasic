package Library2;

public class DVD extends LibraryItem {
    private double duration;

    public DVD(double duration){
        this.duration=duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
