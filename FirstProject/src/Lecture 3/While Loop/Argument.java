public class Argument {
    public static void main(String[] args) {
        int num= SumTwoNo(4,11);
        OpStatement();
        System.out.println(num);

        System.out.println(SumTwoNo(79,11));
        System.out.println(SumTwoNo(47,9347));

    }

    public static int SumTwoNo(int first,int second){
        System.out.println("First no is: "+first);
        System.out.println("Second no is: "+second);
        int sum =first+second;
        return sum;
    }

    public static void OpStatement(){
        System.out.println("Sum output~ ");
    }
}
