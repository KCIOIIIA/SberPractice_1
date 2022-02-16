import java.util.Scanner;
public class Task8 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int k = 1;
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        while (k <= 3){
            System.out.println("Введите вариант ответа:");
            String answer = input.next();
            if (answer.equals("Троллейбус")){
                System.out.println("Правильно!");
                k = 4;
            }
            if (answer.equals("Сдаюсь")){
                System.out.println("Правильный ответ: троллейбус.");
                k = 4;
            }
            if ((!answer.equals("Троллейбус"))&(!answer.equals("Сдаюсь"))){
                if (k == 3){
                    System.out.println("Правильный ответ: троллейбус.");
                    k = 4;
                }
                if (k < 3){
                    System.out.println("Подумай ещё.");
                    k++;
                }
            }
        }
    }
}