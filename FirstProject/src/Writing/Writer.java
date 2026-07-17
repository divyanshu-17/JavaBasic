package Writing;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        String filename = "java-course.txt";
        //try {
           // FileWriter writer = new FileWriter(filename);

        try (FileWriter writer = new FileWriter(filename)){ //‼️🌟 This is try with resource syntax, we should use it
            // so that we don't have to manually close the resources such as write
            writer.write("This is the best course available.");
            for (int i = 0; i < 1000; i++) {
                writer.write(", 👽");
            }
            writer.flush();
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.printf("Exception occurred %s\n", e.getMessage());
        }
    }
}
