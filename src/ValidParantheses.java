import java.util.Stack;

public class ValidParantheses {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);

            if (a == '(' || a == '[' || a == '{') stack.push(a);

            else if (stack.isEmpty()) return false;

            else if (a == ')' && stack.pop() == '(') return true;
            else if (a == '}' && stack.pop() == '{') return true;
            else if (a == ']' && stack.pop() == '[') return true;

        }

        return stack.isEmpty();
    }
}
