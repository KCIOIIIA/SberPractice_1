public class Task4 {
    public static void main(String args[]) {
        double[] a = new double[10];
        double min, max, sum;
        sum = 0;
        for (int i = 0; i < 10; i++) {
            a[i] = (double)Math.random();
            System.out.println(a[i]);
            sum = sum + a[i];
        }
        min = a[0];
        max = a[0];
        for (int i = 1; i < 10; i++){
            if (a[i] < min){
                min = a[i];
            }
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Максимальное значение = " + max);
        System.out.println("Минимальное значение = " + min);
        System.out.println("Среднее значение = " + sum/10);
    }
}