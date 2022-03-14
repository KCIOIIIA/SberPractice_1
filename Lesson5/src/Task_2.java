import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class Task_2 {
    public static void main(String[] args) throws IOException {
        File file =
                new File("C:/SberPractice_1/Lesson5/src/CopylistNames.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        try (FileReader reader =
                     new FileReader("C:/SberPractice_1/Lesson5/src/listNames.txt")) {
            int c, i, j, k;
            int t = 11;
            int[][] a = new int[t][t];
            for (i = 0; i < t; i++) {
                for (j = 0; j < t; j++) {
                    a[i][j] = 0;
                }
            }
            i = 0;            j = 0;            k = 0;
            while ((c = reader.read()) != -1) {
                if ((c != 32) & (c != 44)) {
                        a[i][j] = c;
                        j = j + 1;
                        k = 0;
                }
                else {  k = k + 1;
                    if (k == 1){
                        i = i + 1;}
                    j = 0;}
            }

            int b, h;
            for (i = 0; i < t; i++) {
                for (j = 0; j < t; j++) {
                    k = 0;
                    if (a[i][1] == a[j][1]) {
                        while ((a[i][k] == a[j][k]) & (a[i][k] != 0) & (i != j)) {
                            k = k + 1;
                        }
                    }
                    if ((a[i][k] < a[j][k] & (i != j))){
                        for (h = 0; h < t; h++) {
                            b = a[i][h];
                            a[i][h] = a[j][h];
                            a[j][h] = b;}
                    }
                }
            }
            String S;
            S = "";
            for (i = 0; i < t; i++) {
                for (j = 0; j < t; j++) {
                    if (a[i][j] != 0) {
                        S = S + (char) a[i][j];
                        writer.write((char) a[i][j]);
                        writer.flush();
                    }
                }
            }
            writer.close();
        }
        catch(IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
