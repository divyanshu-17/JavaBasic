import java.util.Scanner;

public class RandomNoGuess {
    int random;

    RandomNoGuess(){
        random=(int) (Math.ceil(Math.random()*100));
    }

    /**
     *
     * @param guessNo the no that player guessed
     * @return
     * -Negative if guessed number is smaller
     * - 0 is guessed the number
     * - Positive if guessed number is bigger
     */
   int guess(int guessNo){
        return guessNo-random;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        RandomNoGuess game= new RandomNoGuess();
        System.out.println("Welcome to guessing game, you will guess number b/w 1-100!");

        int no;
        int result;
        do {
            System.out.print("Guess a no b/w 1-100: ");
            no= input.nextInt();
            result= game.guess(no);

            if (result==0){
                System.out.println("Congrats you've guessed it");
            } else if (result<0) {
                System.out.println("Please guess higher");
            }
            else {
                System.out.println("Please guess lower");
            }
        }while (result!=0);
//
//        final  int randomNo = (int)(Math.random() * 11); // *10 will gen random no b/w 0.01-9.99
//                                                         // int se . hat jaenge values b/w 0-9
//        int no;
//
//        do {
//            System.out.println("Guess the no");
//            no= input.nextInt();
//        }
//        while (no!=randomNo);
//        System.out.println("You guessed it right: "+randomNo);
    }
}
