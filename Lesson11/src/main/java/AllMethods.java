import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class AllMethods {
    public static void main(String[] args){
        List<Integer> map = map(List.of("And", "I'm", "feeling", "good"), (String string) -> string.length());
        System.out.println(map);

        List <Integer> maximum = findTheMost(map);
        System.out.println(maximum);
    }

    private static <T, R> List <R> map(List<T> list, Function <T, R> function) {
        List <R> result = new ArrayList<>();

        for (T t : list){
            R anotherElem = function.apply(t);
            result.add(anotherElem);
        }
        return result;
    }

     public static List <Integer> findTheMost(List<Integer> elements){
        Integer max;
        max = elements.get(0);
        for (int i = 0; i < elements.size(); i++){
            if (max < elements.get(i)){
                max = elements.get(i);
            }
        }
        return Collections.singletonList(max);
    }
}
