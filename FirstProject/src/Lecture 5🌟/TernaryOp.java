import java.util.Scanner;

public class TernaryOp {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Checking bigger no OLD WAYS");
        System.out.println("Type no1 ");
        int no1= input.nextInt();
        System.out.println("Type no2 ");
        int no2= input.nextInt();

  //      int greaterNo; //🌟 changed 1st time
//        if (no1>no2){
//            greaterNo=no1; //🌟
//            // System.out.println(no1 +" is greater");
//        }else {
//            greaterNo=no2; //🌟
//           // System.out.println(no2 +" is greater");
//        }
        int greaterNo = no1 > no2 ? no1 : no2; // 🌟🌟 changed 2nd time
        System.out.println(greaterNo+" is bigger no");
    }
}
