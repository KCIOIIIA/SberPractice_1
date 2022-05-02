public class Rectangle {
    private final Integer width;
    private final Integer height;

    public Rectangle(Integer width, Integer height){
        this.height = height;
        this.width = width;
    }

    public Integer getWidth(){
        return width;
    }

    public Integer getHeight(){
        return height;
    }

    public Integer area() {
        Integer i = width * height;
        return i;
    }
    public String toString(){
        String str1 = String.valueOf(width);
        String str2 = String.valueOf(height);
        return "(ширина = " + str1 + ", высота = " + str2 +")";
    }
}
