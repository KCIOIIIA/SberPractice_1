public class MatrixDriver {
    public static void main(String[] args){
        double k = 2;
        int r = 3;
        int c = 2;
        Матрица m1 = new Матрица(r, c);
        Матрица m2 = new Матрица(r, c);
        Матрица s = new Матрица(r, c);
        m1.full(r, c);
        m1.print();
        m2.full(r, c);

        m1.mult(k);
        m1.print();
        s.summa(m1, m2);

    }
}
