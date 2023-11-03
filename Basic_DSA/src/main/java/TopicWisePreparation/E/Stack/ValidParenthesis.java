package TopicWisePreparation.E.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "";
        // push-> [ { (
        //map[')']= '(';
        Map<Character, Character> check = new HashMap<>();
        check.put(')', '(');
        check.put('}', '{');
        check.put(']', '[');
        Stack<Character> stack = new Stack<>();
        if (str == null || str.isEmpty() || str.length() == 1) {
            System.out.println("OK");
        }
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (ch == ')' || ch == '}' || ch == ']') {
                // pop from stack and check this value is current char(key) map value
                Character popValue = stack.pop();//'('
                Character mapValue = check.get(ch);//'('
                System.out.println(popValue + " " + mapValue);
                if (!popValue.equals(mapValue)) {
                    System.out.println("Not OK");
                    break;
                }
            } else stack.add(ch);

        }

    }
}
