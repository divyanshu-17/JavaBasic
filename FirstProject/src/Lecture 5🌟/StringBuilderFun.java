public class StringBuilderFun {
    public static void main(String[] args) {
      //  System.out.println("StringBuilder also makes a string but this one is MUTABLE and is faster and we" +
        //        "add thing in it by using APPEND(all small)");

        int woo= 99;

        StringBuilder sb= new StringBuilder("First ");
        sb.append(45);
        sb.append(" then ");
        sb.append(97.6489);
        sb.append(" is my no ");

        sb.append("Before 100 we have ").append(woo); //Chaining
        sb.toString();
        System.out.println(sb);
    }
}
