import java.util.Stack;

public class paranthesis {
    static boolean balancedfunction(String exp) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char x;
            switch (ch) {
                case ')':
                    x = stack.pop();
                    if (x == '{' || x == '[') {
                        return false;
                    }
                    break;
                case ']':
                    x = stack.pop();
                    if (x == '(' || x == '{') {
                        return false;
                    }
                    break;
                case '}':
                    x = stack.pop();
                    if (x == '(' || x == '[') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String exp = "({[]})";
        System.out.println(balancedfunction(exp)); // Output: true
    }
}
