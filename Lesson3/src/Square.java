public class Square extends Figure{
    private int width;

    public Square(Point point, int width){
        super(point);
        this.width = width;
    }
    @Override
    public double area() {
        return width*width;
    }
    @Override
    public double perimeter() {
        return 4*(width);
    }
    @Override
    public void draw(){
        draw(Color.Black);
    }
    @Override
    public void draw(Color color){
        System.out.println(String.format("Квадрат с координатой %s, стороной %s и цветом %s%n", point, width, color));
    }
}
