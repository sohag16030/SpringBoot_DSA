package TopicWisePreparation.ArrayAndHashing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(12);
        arr.add(12);
        arr.add(13);
        arr.add(10);
        arr.add(10);

        Map<Integer,Long> frequency =  arr.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
        for(Integer key : frequency.keySet()){
            System.out.println(key);
        }

        Boolean flag = false;

        for(Map.Entry<Integer,Long> entity : frequency.entrySet()){
            if(entity.getValue()>=2) {
                flag = true;break;
            }
        }
        if(flag) System.out.println("true");
        else System.out.println("false");
    }
}
