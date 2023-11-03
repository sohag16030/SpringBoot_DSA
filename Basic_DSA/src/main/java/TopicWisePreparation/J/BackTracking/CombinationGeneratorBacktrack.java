package TopicWisePreparation.J.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationGeneratorBacktrack {
    public static void generateCombinations(List<Integer> input, List<Integer> current, int start) {
        for (int i = start; i < input.size(); i++) {
            current.add(input.get(i));
            System.out.println(current);
            generateCombinations(input, current, i + 1);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(3);
        generateCombinations(elements, new ArrayList<>(), 0);
    }
}
