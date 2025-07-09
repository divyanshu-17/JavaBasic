import java.util.Scanner;

public class LcM {
    public static void main(String[] args) {
        System.out.println("Let LCM");
        Scanner input=new Scanner(System.in);
        System.out.print("1st no: ");
        int a= input.nextInt();
        System.out.println("2nd no: ");
        int b= input.nextInt();

        int value=LcmCal(a,b);
        System.out.println("LCM of 2 no are= "+value);
    }

    public static int LcmCal(int a, int b){
        int i=1;
        while (i<=b){
            int factor=a*i;
            if(factor%b==0){
                return factor;
            }
            i++;
        }
        return 0;
    }
}

