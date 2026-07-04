public class ForEach {
    public static void main(String[] args) {
        String[] array= {"Dibu","Piru","Pusu","Aaryan","Chiti"};
        arrInput(array);
        arrInputForEach(array);
    }

    public static void arrInput(String[] arr){ // Using FOR Loop
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void arrInputForEach(String[] arr){ // Using FOR EACH Loop
        for (String name : arr){
            System.out.print(name+",");
        }
    }
}
