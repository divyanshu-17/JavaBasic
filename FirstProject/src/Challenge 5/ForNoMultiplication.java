import java.util.Scanner;

public class ForNoMultiplication {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the no for which you want multiplication: ");
        int num= input.nextInt();
        mul(num);
        input.close(); // Scanner closed
    }

    public static void mul(int no){
        for (int i=1;i<11;i++){
            System.out.println(no+"*"+i+"="+(no*i));
        }
    }
}
