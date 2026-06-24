import java.util.Scanner;
                                       // do-while ka dusra tarika(static or fixed valued se check)
public class NoGuessGameDoWhile {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num=123456;
        int guess;
        do {
            System.out.print("Guess a 6 digit no: ");
            guess= input.nextInt();
        }while (num!=guess);
        System.out.println("Right no "+ guess);
    }
}
