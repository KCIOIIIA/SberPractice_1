public class Task7 {
    public static void main(String args[]) {
        int a1 = 0;
        int a2 = 1;
        int a3;
        for (int i = 1; i <= 11; i++){
            System.out.print(a1 + " ");
            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
        }
    }
}