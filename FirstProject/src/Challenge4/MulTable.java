import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
      Greet();

      int a=1;
      int num=NoUser();

      while(a<11){
          int i= num*a;
          System.out.println(num+"X"+a+"="+i);
          a++;
      }

    }

    public static void Greet(){
        System.out.println("Let's see Tables👌");
    }

    public static int NoUser(){
        Scanner input=new Scanner(System.in);
        System.out.print("Table of which no? ");
        int give= input.nextInt();
        return give;
    }
}
