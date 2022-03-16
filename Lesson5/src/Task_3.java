import java.io.*;

public class Task_3 {
    public static void main (String[] args) throws IOException, ClassNotFoundException{
        try (ObjectOutputStream objectOutputStream
                     = new ObjectOutputStream(new FileOutputStream("C:/SberPractice_1/Lesson5/src/Olly.txt"));
             ObjectInputStream objectInputStream
                     = new ObjectInputStream(new FileInputStream("C:/SberPractice_1/Lesson5/src/Olly.txt"));
                ) {
            Pets olly = new Pets("Olly", 10, new Black(), new Green());
            objectOutputStream.writeObject(olly);
            System.out.println(olly);
            Pets pets = (Pets) objectInputStream.readObject();
            System.out.println(pets);
        }
    }
}
