import java.util.Stack;
i changed
public class substring {
    static int bal(String str, int x, int y) {
        Stack<Character> stack = new Stack<>();
        int mainscore = 0;
        char first, second;
        int firstscore;
        
        if (x > y) {
            first = 'b';
            second = 'a';
            firstscore = x;
        } else {
            first = 'a';
            second = 'b';
            firstscore = y;
        }
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!stack.isEmpty() && stack.peek() == first && ch == second) {
                stack.pop();
                mainscore += firstscore;
            } else {
                stack.push(ch);
            }
        }
        
        return mainscore;
    }

    public static void main(String[] args) {
        String str = "cdbcbbaaabab";
        int x = 4;
        int y = 5;
        System.out.println(bal(str, x, y));
    }
}
