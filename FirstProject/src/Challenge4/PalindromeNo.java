import java.util.Scanner;

public class PalindromeNo {
    public static void main(String[] args) {
        System.out.println("We are going to find out that if a no is Palindrome ");
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a no");
        int a=input.nextInt();
        int b=Check(a);
        System.out.println("Received no is "+b);
        if(b==a){
            System.out.println("No is Palindrome👌");
        }
        else{
            System.out.println("No is not Palindrome😩");
        }
    }

    public static int Check(int c){
        int x;
        int sum=0;
        while(c!=0){
            x=c%10;
            sum=sum*10+x;
            c=c/10;
            System.out.println(sum);
        }
        return sum;
    }
}
