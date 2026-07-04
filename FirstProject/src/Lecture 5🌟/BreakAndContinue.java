public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("Before loop break");
        for (int i=1;i<1000;i++){
            if (i==101){
                break;
            }
            System.out.print(i+",");
        }
        System.out.println("After loop break");

        System.out.println("Before loop continue");
        for (int j=1;j<100;j++){
            if (j%2==0){
                continue;
            }
            System.out.print(j+",");
        }
        System.out.println("After loop continue");
    }


}
