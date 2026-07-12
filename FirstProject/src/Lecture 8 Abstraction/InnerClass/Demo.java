package in.Abstra.InnerClass;

public class Demo {
    public static void main(String[] args) {
       // Some obj= new Some(); We can't make a object because it's an abstract class and just to use show we have to
        // make a child class
        Some obj= new Some() {
           // @Override even if we don't write @Override it's understood this is what's happening
            public void show() { // now this is a inner class
                System.out.println("Showing");
            }
        };
    }
}
