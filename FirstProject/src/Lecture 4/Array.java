public class Array {
    public static void main(String[] args) {
        System.out.println("ARRAY!!");
        one();
        two();
        three();
        four();
    }

    public static void one(){
        int[] myArr= new int[5];

        myArr[0]=11;
        myArr[3]=44;
        myArr[4]=55;
        myArr[2]=33;
        myArr[1]=22;

        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]);
    }

    public static void two(){
        int[] myArr= {11,22,33,44,55};

        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]);
    }
    public static void three() {
        int[] myArr = {11, 22, 33, 44, 55};

        int a=0;
        int b=1;
        int c=2;
        int d=3;
        int e=4;

        System.out.println(myArr[a]);
        System.out.println(myArr[b]);
        System.out.println(myArr[c]);
        System.out.println(myArr[d]);
        System.out.println(myArr[e]);
    }
    public static void four() {
        int[] myArr = {11, 22, 33, 44, 55};
        int index=0;
        while(index<5){
            System.out.println(myArr[index]);
            index++;
        }
    }

}
