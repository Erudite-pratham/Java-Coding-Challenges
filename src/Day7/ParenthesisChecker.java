package Day7;

import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String x = "([]";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < x.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(x.charAt(i));
            } else if (stack.peek() == '{' && x.charAt(i) == '}') {
                stack.pop();
            } else if (stack.peek() == '(' && x.charAt(i) == ')') {
                stack.pop();
            } else if (stack.peek() == '[' && x.charAt(i) == ']') {
                stack.pop();
            } else {
                stack.push(x.charAt(i));
            }
        }

        System.out.println(stack.isEmpty());
    }
}
