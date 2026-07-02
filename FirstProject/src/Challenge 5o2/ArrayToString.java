public class ArrayToString {
    public static void main(String[] args) {
        String[] arr= new String[] {"Hi","I", "am", "a", "boy",
        "and","my", "name", "is", "Divyanshu"};

        System.out.println(arr);

        StringBuilder sb= new StringBuilder();
        for (String str: arr){
            sb.append(str).append("~");
        }
        System.out.println(sb);
    }
}
