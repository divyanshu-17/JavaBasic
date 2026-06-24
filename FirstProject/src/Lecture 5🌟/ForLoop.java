public class ForLoop {
    public static void main(String[] args) {
        int i =1;
        while (i<100){
            System.out.print(i +" ");
            i++;
        }
        System.out.println();

        for (int j=1; j<100; j++){
            System.out.print(j +" ");
        }
        System.out.println();

        for (int k=1; k<100; k+=2){  // every 2nd one
            System.out.print(k +" ");
        }

    }
}
