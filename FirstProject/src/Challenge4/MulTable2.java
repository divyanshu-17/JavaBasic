import java.util.Scanner;

public class MulTable2 {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter no:");
        int num= input.nextInt();
        MulVal(num);

    }

    public static void MulVal(int num){
        int i=1;
        while (i<11){
            System.out.println(num+"X"+i+"="+(num*i));
            i++;
        }
    }
}
