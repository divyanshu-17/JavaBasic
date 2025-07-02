import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        System.out.println("Calculate sum of all odd nos till N\n");
        int Number;
        Number=Input();
        System.out.println("Sum of all nos is "+Number);
    }

    public static int Input(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the till which you want the Odd sum Cal.");
        int no= input.nextInt();
        int i=1;
        int a=0;

        if(no>=i){
            while(i<=no){
                if(i%2!=0){
                    a=a+i;
                }
                i=i+1;
            }
        }
        return a;
    }
}
