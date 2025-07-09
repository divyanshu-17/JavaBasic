import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        System.out.println("We'll find if the no is armstrong ");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int a= input.nextInt();
        int arm1=ArsDigCo(a);
        System.out.println("No of digits ="+arm1);
        int x=ArsNoSq(a,arm1);
        System.out.println("Sum of "+arm1+" is "+x);

        if(a==x){
            System.out.println(a+" is an Armstrong No👌");
        }
        else{
            System.out.println(a+" is not a Armstrong No😩");
        }
    }

    public static int ArsDigCo(int b){
        int c=0;
        while(b!=0){
            b=b/10;
            c++;
        }return c;
    }

    public static int ArsNoSq(int c, int d){
        int sum=0;
        while(c!=0){
            int e=c%10;
            int mul=1;
            for(int i=1; i<=d;i++){
                mul=mul*e;
            }
            sum=sum+mul;
            c=c/10;
        }
        return sum;
    }
}
