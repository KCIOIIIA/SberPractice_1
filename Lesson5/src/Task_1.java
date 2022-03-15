import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        File file =
                new File("C:/SberPractice_1/Lesson5/src/CopyBorodino.txt");

        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        try(FileReader reader =
                    new FileReader("C:/SberPractice_1/Lesson5/src/Borodino.txt")) {
            int c, k;
            k = 0;
            while ((c = reader.read()) != -1){
                if (c != 32){
                    k = 0;}
                else {k = k + 1;}
                if (k <= 1){
                    writer.write((char) c);
                    writer.flush();
                }
            }writer.close();
        }
        catch(IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
