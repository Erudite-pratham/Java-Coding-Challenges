package Day6;

import java.util.Stack;

public class ReverseWordsInAGivenString {
    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        Stack<String> stack = new Stack<>();

        String ans = "";
        String temp = "";
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '.') {
                temp += S.charAt(i);
            }
            if (S.charAt(i) == '.') {
                stack.push(temp);
                temp = "";
            }
        }
        stack.push(temp);
        System.out.println(stack);
        while (!stack.isEmpty()) {
            ans = ans + stack.pop() + (!stack.isEmpty() ? "." : "");
        }
        System.out.println(ans);
    }
}
