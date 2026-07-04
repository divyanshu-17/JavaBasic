public class MathFun {
    public static void main(String[] args) {
        System.out.println(Math.abs(-97));
        System.out.println(Math.ceil(5.1));
        System.out.println(Math.floor(5.9));
        System.out.println(Math.round(5.49));
        System.out.println(Math.PI);

        System.out.println("10 Randoms");
        for (int i = 0; i < 10; i++) {
            double random = Math.round(Math.random()*100);
            System.out.println(random);
        }
    }
}
