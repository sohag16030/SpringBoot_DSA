package RapidRound.Leetcode.backTracking;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleCombination {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
       // input.add(2);
        List<List<Integer>> eniqualList = allPossibleCombination(input,new ArrayList<>(),0);

    }

    private static List<List<Integer>> allPossibleCombination(List<Integer> input, ArrayList<Integer> current, int start) {
        for(int i=start;i<input.size();i++){
            current.add(input.get(i));
            System.out.println(current);
            allPossibleCombination(input,current,i+1);
            current.remove(current.size()-1);
        }
        return null;
    }
}
