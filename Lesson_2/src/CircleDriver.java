public class CircleDriver {
    public static void main(String[] args){
        Circle A = new Circle (("Красный"), (3.13));
        Circle B = new Circle (("Синий"), (2));

        System.out.println(A.color);
        System.out.println(B.area());
        System.out.println(A.perimeter());
        System.out.println(A);
    }
}
