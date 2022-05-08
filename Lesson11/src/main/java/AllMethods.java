import java.util.List;

public class AllMethods {
    public static void main(String[] args) {
        Integer theMostInteger = findTheMost(List.of(50, 1, 100),
                ((integer1, integer2) -> integer1 > integer2 ? integer1 : integer2));
        String theMostString = findTheMost(List.of("And", "I'm", "feeling", "good"),
                (string1, string2) -> string1.length() > string2.length() ? string1 : string2);
        Rectangle theMostRectangle = findTheMost(List.of(
                        new Rectangle(10, 20),
                        new Rectangle(6, 40),
                        new Rectangle(11, 12)
                ),
                (rectangle1, rectangle2) -> rectangle1.area() > rectangle2.area() ? rectangle1 : rectangle2);
        Traveler theMostTraveler = findTheMost(List.of(
                        new Traveler(10, 2),
                        new Traveler(6, 4),
                        new Traveler(11, 1)
                ),
                (traveler1, traveler2) -> traveler1.way() > traveler2.way() ? traveler1 : traveler2);

        System.out.println(theMostInteger);
        System.out.println(theMostString);
        System.out.println(theMostRectangle);
        System.out.println(theMostTraveler);
    }

    public static  <E> E findTheMost(List <E> elements, FindTheMostFunction <E> function){
        E max = elements.get(0);

        for (E element : elements) {
            max = function.max(element, max);
        }
        return max;
    }

    @FunctionalInterface
    public interface FindTheMostFunction <E> {
        E max(E elem1, E elem2);
    }
}
