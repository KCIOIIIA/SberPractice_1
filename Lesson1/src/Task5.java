public class Task5 {
    public static void main(String args[]) {
        int j;
        int k;
        for (int i = 2; i < 101; i++){
            k = 0;
            j = 1;
            while ((k <= 3)&(j <= i)){
                if (i % j == 0){
                    k++;}
                j++;
            }
            if (k <= 2){
                System.out.print(i + " ");
            }
        }
    }
}