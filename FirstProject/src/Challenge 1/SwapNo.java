public class SwapNo {
    public static void main(String[] args) {
        float myNo= 5;
        System.out.println(myNo);
        float myNo2= 6;
        System.out.println(myNo2);
        float myNo3= myNo;
         myNo= myNo2;
        System.out.println("After swap myNo is "+ myNo);
        myNo2=myNo3;
        System.out.println("After swap myNo2 is "+ myNo3);

    }
}
