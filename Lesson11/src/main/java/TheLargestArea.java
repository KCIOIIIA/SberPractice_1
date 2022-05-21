import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TheLargestArea {
    public static void main(String[] args){
        List<Rectangle> rectangles = Arrays.asList(
                new Rectangle(2, 5),
                new Rectangle(5, 7),
                new Rectangle(17, 51),
                new Rectangle(4, 1)
        );
        System.out.println(rectangles);

        List <Rectangle> maxarea = filterByTheLargestArea(rectangles);

        System.out.println(maxarea);
    }
    public static List<Rectangle> filterByTheLargestArea(List<Rectangle> rectangles){
        Rectangle maxRec;
        maxRec = rectangles.get(1);
        for (int i = 0; i < rectangles.size(); i++) {
            if (maxRec.area() < rectangles.get(i).area()){
                maxRec = rectangles.get(i);
            }
        }
            return Collections.singletonList(maxRec);
    }
}
