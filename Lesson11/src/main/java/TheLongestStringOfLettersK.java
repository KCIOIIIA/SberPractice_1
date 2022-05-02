import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//поиск в списке строк строки, содержащей наибольшее количество букв "К"/"к"

public class TheLongestStringOfLettersK {
    public static void main(String[] args){
        List<String> stringsK = new ArrayList<>();
        stringsK.add("Самба белого мотылька");
        stringsK.add("У открытого огонька");
        stringsK.add("Как бы тонкие крылышки");
        stringsK.add("Не опалить");

        System.out.println(stringsK);

        List <String> maxstringK = filterByTheLongestStringOfLettersK(stringsK);

        System.out.println(maxstringK);
    }

    public static List<String> filterByTheLongestStringOfLettersK(List<String> stringsK){
        int count, index, index0, max = 0;
        String maxStr = "";
        for (int i = 0; i < stringsK.size(); i++){
            count = 0;
            index0 = 0;
            while (index0 < stringsK.get(i).length()) {
                index = stringsK.get(i).indexOf("К", index0);
                if (index != -1) {
                    count = count + 1;
                    index0 = index + 1;
                }
                else{index0 = index0 + 1;}
            }
            index0 = 0;
            while (index0 < stringsK.get(i).length()) {
                index = stringsK.get(i).indexOf("к", index0);
                if (index != -1) {
                    count = count + 1;
                    index0 = index + 1;
                }
                else{index0 = index0 + 1;}
            }
            if (max < count){
                max = count;
                maxStr = stringsK.get(i);
            }
        }
        return Collections.singletonList(maxStr);
    }
}
