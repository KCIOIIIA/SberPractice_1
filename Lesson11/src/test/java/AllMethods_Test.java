import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import org.testng.internal.collections.OneToTwoDimArrayIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class AllMethods_Test {
    @Test
    public void TestMaxNumber_1(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(17);

        List <Integer> maxnumber = MaxNumber.filterByMaxNumber(numbers);

        List<Integer> test = new ArrayList<>();
        test.add(17);
        Assertions.assertEquals(test, maxnumber);
    }

    @Test
    public void TestMaxNumber_2(){
        Integer theMostInteger = AllMethods.findTheMost(List.of(50, 1, 100),
                ((integer1, integer2) -> integer1 > integer2 ? integer1 : integer2));

        Assertions.assertEquals(100, theMostInteger);
    }

    @Test
    public void TestTheLongestString_1(){
        List<String> strings = new ArrayList<>();
        strings.add("Birds flying high");
        strings.add("Sun in the sky");
        strings.add("Reeds drifting on by");

        List <String> maxstring = TheLongestString.filterByTheLongestString(strings);
        List<String> test = new ArrayList<>();
        test.add("Reeds drifting on by");
        Assertions.assertEquals(test, maxstring);
    }

    @Test
    public void TestTheLongestString_2(){
        String theMostString = AllMethods.findTheMost(List.of("And", "I'm", "feeling", "good"),
                (string1, string2) -> string1.length() > string2.length() ? string1 : string2);

        Assertions.assertEquals("feeling", theMostString);
    }

    @Test
    public void TestTheLargestArea_1(){
        List<Rectangle> rectangles = Arrays.asList(
                new Rectangle(2, 5),
                new Rectangle(5, 7),
                new Rectangle(4, 1)
        );

        List <Rectangle> maxarea = TheLargestArea.filterByTheLargestArea(rectangles);

        List<Rectangle> test = Arrays.asList(
                new Rectangle(5, 7));
        Assertions.assertEquals(test, maxarea);
    }

    @Test
    public void TestTheLargestArea_2(){
        Rectangle theMostRectangle = AllMethods.findTheMost(List.of(
                        new Rectangle(10, 20),
                        new Rectangle(6, 40),
                        new Rectangle(11, 12)
                ),
                (rectangle1, rectangle2) -> rectangle1.area() > rectangle2.area() ? rectangle1 : rectangle2);

        Rectangle test = new Rectangle(6, 40);
        Assertions.assertEquals(test, theMostRectangle);
    }

    @Test
    public void TestTheLongestWay_1(){
        List<Traveler> travelers = Arrays.asList(
                new Traveler(20, 5),
                new Traveler(10, 7),
                new Traveler(17, 4)
        );

        List <Traveler> maxway = TheLongestWay.filterByTheLargestWay(travelers);
        List<Traveler> test = Arrays.asList(
                new Traveler(20, 5));
        Assertions.assertEquals(test, maxway);
    }

    @Test
    public void TestTheLongestWay_2(){
        Traveler theMostTraveler = AllMethods.findTheMost(List.of(
                        new Traveler(10, 2),
                        new Traveler(6, 4),
                        new Traveler(11, 1)
                ),
                (traveler1, traveler2) -> traveler1.way() > traveler2.way() ? traveler1 : traveler2);

        Traveler test = new Traveler(6, 4);
        Assertions.assertEquals(test, theMostTraveler);
    }
}
