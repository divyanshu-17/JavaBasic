package Writing;

import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        String filename= "java-course.txt";

        // ❌ won't compile without try-catch or throws⬇️
        try(FileReader reader = new FileReader(filename)){
            int read=0;  // int because it needs to hold -1 as end signal
            do{
                read = reader.read();
//                How reader.read() works:
//                It reads one character at a time but returns it as its ASCII/Unicode number:
//                'H' → 72
//                'e' → 101
//                'l' → 108
//                'o' → 111
//                end → -1
                System.out.print((char)read); //Why convert to char?
                //Because 72 means nothing to us — 'H' does.
            }while (read!= -1); // -1 end of file
        }catch (IOException e){
            System.out.printf("Exception occoured %s", e.getMessage());
        }
    }

}
