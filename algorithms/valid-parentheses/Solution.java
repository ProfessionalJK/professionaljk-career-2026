import java.util.Stack;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isValidParentheses("()[]{}"));
        System.out.println(isValidParentheses("(]"));
        System.out.println(isValidParentheses("([)"));
        System.out.println(isValidParentheses("{[]}"));
    }

    public static boolean isValidParentheses(String inputStream) {
        if (inputStream.equals(null)) return false;

        Stack<Character> stackOfCharacter = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (Character c : inputStream.toCharArray()) {
            if (map.containsValue(c)) {
                stackOfCharacter.push(c);
            }
            else if (map.containsKey(c)) {
                if (stackOfCharacter.isEmpty() || stackOfCharacter.pop() != map.get(c)) {
                    return false;
                }
            }
            else {
                return false;
            }
        }

        return stackOfCharacter.isEmpty();
    }
}