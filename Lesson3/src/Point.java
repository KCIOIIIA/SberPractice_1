public class Point {
    public double x;
    public double y;

    public abstract class Figure {
        Point point;

        public double area() {
            //        return S;
        }

        public double perimeter() {
            //        return P;
        }

    }
}

class Circle extends Point{

}
class Rectangle extends Point{

}

class Square extends Rectangle{

}
class Triangle extends Point{

}