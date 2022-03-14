import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Task_3 {
    public static void main (String[] args) throws IOException, ClassNotFoundException{
        try (FileInputStream fileInputStream
                     = new FileInputStream("C:/SberPractice_1/Lesson5/src/Character_1.txt");
             ObjectInputStream objectInputStream
                     = new ObjectInputStream(fileInputStream)
                ) {
            Character character = (Character) objectInputStream.readObject();
            System.out.println(character);
        }


    }
}
