import java.util.Scanner;

public class FibonachiSer {
    public static void main(String[] args) {
        System.out.println("We will be calculating fibonacchi ");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter no till which fibo to be calculated: ");
        int a= input.nextInt();
        Fibo(a);
    }

    public static void Fibo(int b){
      if(b<0) return;
      if(b==0){
          System.out.println("0");
          return;
      }

      int f1=0 , f2=1;
        System.out.print("Fibonacci Series is: "+ f1+" "+f2+" ");
      int f3;
      while(f1+f2<=b){
         f3=f1+f2;
          System.out.print(f3+" ");
         f1=f2;
         f2=f3;
      }

    }
}
