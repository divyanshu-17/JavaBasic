public class StringFun {
    public static void main(String[] args) {
        String name="Dibu";
        int marks= 65;
        double woo=Math.random()*100;

       // System.out.println("Hi "+name+" your marks are "+marks); // Old way

        System.out.printf("Hi %s, your marks are %d\n",name,marks); // New way !! if we put %S name will be in all caps
        System.out.printf("%15f\n",woo);
    }
}
