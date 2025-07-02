public class IfElse {
    public static void main(String[] args) {
        boolean isMale=false;

        String name= "Roshan";
        if (isMale){
            System.out.println("The name can be called as Mr. "+name);
        }
        else {
            System.out.println("The name can be called as Mrs."+name);
        }
        boolean Old=false;
        boolean Adult=false;

        if (Old){
            System.out.println("Hi Oldman ");

        }else if(Adult){
            System.out.println("Hi Youngman ");

        }else{
            System.out.println("Hi child");
        }
    }
}
