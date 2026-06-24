import java.util.Scanner;
                                        // do-while ka ek tarika(dynamic- no fix value)
public class PasswordCheckDoWhile {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String password;
        do {
            System.out.println("Please enter password: ");
            password= input.next();
        }while (!isValidPass(password));
    }

    public static boolean isValidPass(String pass){
        return pass.length()>6;  // kuch bhi condtion rakh skte h yhi nhi
    }
}
