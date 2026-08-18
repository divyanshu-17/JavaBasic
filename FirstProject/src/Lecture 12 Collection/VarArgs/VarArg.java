package in.VarArgs;

public class VarArg {
    public static void main(String[] args) {
        System.out.println(add(5,6));
        System.out.println(sum(new int[]{4,5,6}));
        System.out.println(vAsum(5,7,9,6,3));
    }

    public static int vAsum(int... a){ //‼️‼️🌟 int... also converts into array ,but it is used mainly for
        // simplification and beautification
        int sum=0;
        for(int i : a){
            sum+=i;
        }return sum;
    }

    public static int sum(int[] a){//This will add as many elements but will be in array
        int sum=0;
        for(int i : a){
            sum+=i;
        }return sum;
    }

    public static int add(int a, int b){ //This will add only 2 elements
        return a+b;
    }
}
// suppose we want minimum of 2 nos at-least so we can do, public static int vAsum(int a, int b, int... a){ ‼️‼️🌟
// means at-least 2 and then more if you want!!