public class DiceRollRandom {
    public static void main(String[] args) {
        int dice;
           // int dice= (int) Math.random()*100;
        for (int i = 0; i < 10; i++) {
            dice = (int) (Math.random() * 6) + 1; // gives 1 to 6
            System.out.println("Your random dice no: " + dice);
        }
    }
}
