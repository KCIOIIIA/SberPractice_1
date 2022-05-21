import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MaxNumber {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(17);
        numbers.add(-15);

        System.out.println(numbers);

        List <Integer> maxnumber = filterByMaxNumber(numbers);

        System.out.println(maxnumber);
    }
    public static List<Integer> filterByMaxNumber(List<Integer> numbers){
        Integer max;
        max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++){
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return Collections.singletonList(max);
    }
}
