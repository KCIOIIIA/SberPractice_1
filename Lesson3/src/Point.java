public class Point {
    public double x;
    public double y;
    public Point(double X, double Y) {
        x = X;
        y = Y;
    }
    public abstract class Figure {
        Point point;
        public double S;
        public double P;

        public double area() {
            return S;
        }
        public double perimeter() {
            return P;
        }
    }
}
class Circle extends Point{
    class Circle implements Drawable{};
}
class Rectangle extends Point{
    class Rectangle implements Drawable{};
}
class Square extends Rectangle{
    class Square implements Drawable{};
}
class Triangle extends Point{
    class Triangle implements Drawable{};
}
public interface Drawable {
    void draw(){};
    void draw(Color color){};
}
public class FigureUnit {
    private class Figure {
        Figure figure;
        public double area(Figure figure) {
            return S;
        }
        public double perimeter(Figure figure) {
            return P;
        }
        void draw(){
            System.out.println("(" + x + ", " + y + ") - Black");
        };
        void draw(Color color){
            System.out.println(color);
        };
    }
}
public class Paint{
    public static void main(String[] args){
        Point A = new Point(0, 0);
        Point B = new Point(6, 0);
        Point C = new Point(4, 2);
        Point D = new Point(0, 2);
        Point.Figure F = new Point.Figure();
        FigureUnit E = new FigureUnit();
    }
}
