public class Матрица {
    public int row = 3;
    public int columns = 2;
    public double [][] a = new double[row][columns];
    public double [][] b = new double[row][columns];
    public double [][] s = new double[row][columns];

    public Матрица(int c, int r){
        row = r;
        columns = c;
        a = new double[row][columns];
        b = new double[row][columns];
        s = new double[row][columns];
    }
    public void full(int c, int r){
        row = r;
        columns = c;
        a = new double[row][columns];
        int i = 0;
        while (i < row) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = (int) (Math.random()*10);
            }
            System.out.println();
            i = i + 1;
        }
    }
    public void print(){
        System.out.println("Матрица: ");
        int i = 0;
        while (i < row) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + "   ");
            }
            System.out.println();
            i = i + 1;
        }
    }
    public void mult(double k){
        int i = 0;
        while (i < row) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = a[i][j]*k;
            }
            i = i + 1;
        }
    }
    public void summa(Матрица m1, Матрица m2){
        int i = 0;

        System.out.println("Сумма матриц: ");

    //    while (i < row) {
     //      for (int j = 0; j < columns; j++) {
     //          s[i][j] = 0;
     //          System.out.println("a[" + i + "][" + j + "] = " + a[i][j]);
    //           s[i][j] = a[i][j] + b[i][j];
    //           System.out.print(s[i][j] + "   ");
    //       }
    //       i = i + 1;
    //       System.out.println();
    //    }
    }
}
