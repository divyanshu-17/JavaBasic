public class ToStringIntro {
    int noOfWheels;         //‼️🌟‼️Pehle bhi hum obj ko print krte the suppose- Student s1 = new Student();
    int noOfDoors;     // s1.name = "Divyanshu";      s1.age = 21; aur fir print krne k lie
    int maxSpeed;    // System.out.println(student.name); 🌟 System.out.println(student.age)
    String name;    // But isse hum man chaha present bhi kr skte h aur ek hi line me System.out.println(student);
    String modelNo;
    String company;

    public ToStringIntro(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNo, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNo = modelNo;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Car {"+"Name= "+name+
                ", Company = "+company+", Max Speed ="+maxSpeed+", No of Wheels = "+noOfWheels+"}";
    }

    public static void main(String[] args) {
        ToStringIntro swift= new ToStringIntro(4,5,
                220,"Brezza","XUV9","Maruti");
        System.out.println(swift);
    }
}
