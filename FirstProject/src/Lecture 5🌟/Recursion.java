import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Factorial using Recursion");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a no: ");
        int no= input.nextInt();
        long fact=factCount(no);
        System.out.println(fact);
        long facti=factCountRecursion(no);
        System.out.println(facti);
    }

    public static long factCount(int no){
        int result=1;
        for (int i=1;i<=no;i++){
            result=result*i;
        }
        return result;
    }

    public static long factCountRecursion(int num){
        if (num==1){
            return 1;
        }
        return num * factCountRecursion(num-1);
    }
}
