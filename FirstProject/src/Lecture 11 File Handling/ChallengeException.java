package Writing;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ChallengeException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give file location to read: ");
        String fileName = input.nextLine();

        try (FileReader reader = new FileReader(fileName)){
            int read=0;
            do{
                read = reader.read();
                System.out.print((char)read);
            }while (read!= -1);
        }catch (FileNotFoundException exc){
            System.out.println("File not found "+ exc.getMessage());
        } catch (IOException e) {
            System.out.println("End");
        }
    }
}
// Give file location to read: C:\Users\divya\Documents\For Java\Example1.txt