import java.util.Stack;

public class Parentheses {

/*
    stack: LIFO
    Array: convert string to Array
    String: charAt to get each character
    Loop: to push and pop items to the stack
 */

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()){
            if (c =='(')
                stack.push(')');
            else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

