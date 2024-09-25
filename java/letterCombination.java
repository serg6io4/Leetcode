import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class letterCombination {

    public List<String> letterCombinations(String digits) {
        List<String> resultado  = new ArrayList<>();
        
        if(digits == null || digits.isEmpty()) return resultado;

        Map<Character, String> diccionario = new HashMap<>();
        diccionario.put('2', "abc");
        diccionario.put('3', "def");
        diccionario.put('4', "ghi");
        diccionario.put('5', "jkl");
        diccionario.put('6', "mno");
        diccionario.put('7', "pqrs");
        diccionario.put('8', "tuv");
        diccionario.put('9', "wxyz");

        backtracking(resultado, new StringBuilder(), digits, 0, diccionario);

        return resultado;
    }

    private void backtracking(List<String> resultado, StringBuilder stringBuilder, String digits, int i, Map<Character, String> diccionario) {
        //Condición de parada
        if(i == digits.length()){
            //Si ha llegado a la longitud pues se guarda en resultado
            resultado.add(stringBuilder.toString());
            return;
        }  

        char digitoActual = digits.charAt(i);
        String letras = diccionario.get(digitoActual);
        for(char letra :  letras.toCharArray()){
            stringBuilder.append(letra);
            backtracking(resultado, stringBuilder, digits, i+1, diccionario);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }

    public static void main(String[] args) {
        letterCombination solution = new letterCombination();
        System.out.println(solution.letterCombinations("23")); // Output: [ad, ae, af, bd, be, bf, cd, ce, cf]
        System.out.println(solution.letterCombinations(""));    // Output: []
        System.out.println(solution.letterCombinations("2"));   // Output: [a, b, c]
    }
}
