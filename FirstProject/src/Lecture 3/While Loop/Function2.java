public class Function2 {
    public static void main(String[] args) {
        LStarPatt();
        LStarRevPatt();

    }

    public static void LStarPatt(){
        int i=0;
        while (i<5){
            System.out.print(" *");
            int a=0;
            while(a<i){
                System.out.print(" *");
                a++;
            }
            System.out.println();
            i++;

        }
    }

    public static void LStarRevPatt(){
        int i=5;
        while (i>0){

            int a=0;
            while (a<i){
                System.out.print(" *");
                a++;
            }
            System.out.println();
            i--;
        }
    }
}
