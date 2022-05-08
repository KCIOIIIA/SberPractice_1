import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TheLongestWay {
    public static void main(String[] args){
        List<Traveler> travelers = Arrays.asList(
                new Traveler(20, 5),
                new Traveler(10, 7),
                new Traveler(17, 4),
                new Traveler(4, 1)
        );
        System.out.println(travelers);

        List <Traveler> maxway = filterByTheLargestWay(travelers);

        System.out.println(maxway);
    }
    public static List<Traveler> filterByTheLargestWay(List<Traveler> travelers){
        Traveler maxRec;
        maxRec = travelers.get(1);
        for (int i = 0; i < travelers.size(); i++) {
            if (maxRec.way() < travelers.get(i).way()){
                maxRec = travelers.get(i);
            }
        }
        return Collections.singletonList(maxRec);
    }
}
