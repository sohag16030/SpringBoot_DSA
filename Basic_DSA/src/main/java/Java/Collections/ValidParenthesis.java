package Java.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "[{}(){}]";
        Map<Character,Character> pair = new HashMap<>();
        pair.put('[',']');
        pair.put('{','}');
        pair.put('(',')');

        Stack<Character> stack = new Stack<Character>();

        for(Character ch : str.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else{
                Character peek = stack.peek(); // '('
                if(ch==pair.get(peek)) stack.pop();
                else break;
            }
        }
    }
}
