import java.util.Stack;

public class validParentheses {

    public boolean isValid(String s) {
        Stack<Character> pila = new Stack<>();
        for(char x : s.toCharArray()){
            if(x == '(' || x == '[' || x == '{'){
                pila.push(x);
            }else{
                if (pila.isEmpty()) {
                    return false; // No hay apertura correspondiente
                }
                if(x == ')' && '('== pila.peek()){
                    pila.pop();
                }else if (x == ']' && '['== pila.peek()) {
                    pila.pop();
                }else if(x == '}' && '{'== pila.peek()){
                    pila.pop();
                }else{
                    return false;
                }
            }
        }
        return pila.empty();
    }

    public void main(String[] args) {
        String s = "(]";
        validParentheses valido = new validParentheses();
        System.out.println(valido.isValid(s));
    }
}
