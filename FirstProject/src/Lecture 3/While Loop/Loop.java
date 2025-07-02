import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int no=1; //Initialize
        while(no<10){ //Condition
            System.out.println(no); //Main work
            no=no+1;
        }

        int count=500;
        while(count>=199){
            System.out.println(count);
            count=count-1;
        }
        Scanner ip=new Scanner(System.in);
        int Ank=0;
        while (Ank < 5){
            System.out.println("Enter a no~ ");
            int Dena= ip.nextInt();
            System.out.println("Your given no : "+Dena);
            Ank++;
        }
    }
}
