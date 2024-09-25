import java.util.ArrayList;
import java.util.List;

public class generateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtracking(result, "", 0, 0, n);
        return result;
    }

    private void backtracking(List<String> result, String cadena, int open, int close, int n) {
        if(cadena.length() == 2*n){
            result.add(cadena);
            return;
        }

        if(open< n){
            backtracking(result, cadena+"(", open+1, close, n);
        }
        if(close < open){
            backtracking(result, cadena+")", open, close+1, n);
        }
    }

    public void main(String[] args) {
        generateParentheses ner = new generateParentheses();
        System.out.println(ner.generateParenthesis(3).toString());
    }
}
