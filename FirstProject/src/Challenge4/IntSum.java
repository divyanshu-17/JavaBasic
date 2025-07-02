import java.util.Scanner;//❤️

public class IntSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a no to add: ");
        int num= input.nextInt();
        int sum=SumInt(num);
        System.out.println(sum);

    }

    public static int SumInt(int no){
        int a=0;
        while (no>0){
            a=a+no%10;
            no=no/10;
        }
        return a;
    }
}
