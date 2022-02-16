public class Task1 {
    public static void main(String args[]) {
        int[] a = {17, 4, 51, 7, 4, 0, 1};
        int b;

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                if (a[i] < a[j]) {
                    b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}