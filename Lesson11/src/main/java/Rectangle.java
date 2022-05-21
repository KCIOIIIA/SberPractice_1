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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rectangle other = (Rectangle) obj;
        if (width != other.width)
            return false;
        if (height == null) {
            if (other.height != null)
                return false;
        } else if (!height.equals(other.height))
            return false;
        return true;
    }

    public String toString(){
        String str1 = String.valueOf(width);
        String str2 = String.valueOf(height);
        return "(ширина = " + str1 + ", высота = " + str2 +")";
    }
}
