public class MatrixDriver {
    public static void main(String[] args) {
        double k = -2;
        int r = 2;
        int c = 2;
        Matrix m1 = new Matrix(r, c);
        Matrix m2 = new Matrix(r, c);
        System.out.println("Первая матрица:");
        m1.full(r, c);
        m1.print();
        System.out.println("Вторая матрица:");
        m2.full(r, c);
        m2.print();

        m1.mult(m1, m2);
        m1.summa(m1, m2);

        System.out.println("Вторая матрица, умноженная на " + k + ":");
        m2.multK(k);
        m2.print();
    }
}
