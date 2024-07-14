import java.util.Stack;

public class postfix {
    static int evaluatepostfix( String expression){
        Stack<Integer> stack =new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if(Character.isDigit(ch)){
                stack.push(ch - '0');
            }else{
                int v1=stack.pop();
                int v2=stack.pop();
                switch (ch) {
                    case '+':
                    stack.push(v1+v2);
                    break;
                    case '-':
                    stack.push(v2-v1);
                    break;
                    case '*':
                    stack.push(v1*v2);
                    break;
                    case '/':
                    stack.push(v2/v1);
                    break;
                
                    
                }
                

            }
            
        }
        return stack.pop();  
        
       
    }
    public static void main(String[] args) {
        String expression ="231*+9-";
        System.out.println(evaluatepostfix(expression));
    }
}
