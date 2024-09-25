
import java.util.HashMap;
import java.util.Map;

public class sumDigitString {
    
    public int getLucky(String s, int k) {

        String resultado = "";
        Map dict = new HashMap<Character, String>();
        dict.put('a', "1");
        dict.put('b', "2");
        dict.put('c', "3");
        dict.put('d', "4");
        dict.put('e', "5");
        dict.put('f', "6");
        dict.put('g', "7");
        dict.put('h', "8");
        dict.put('i', "9");
        dict.put('j', "10");
        dict.put('k', "11");
        dict.put('l', "12");
        dict.put('m', "13");
        dict.put('n', "14");
        dict.put('o', "15");
        dict.put('p', "16");
        dict.put('q', "17");
        dict.put('r', "18");
        dict.put('s', "19");
        dict.put('t', "20");
        dict.put('u', "21");
        dict.put('v', "22");
        dict.put('w', "23");
        dict.put('x', "24");
        dict.put('y', "25");
        dict.put('z', "26");

        for(char x : s.toCharArray()){
            resultado += dict.get(x);
        }
        for(int i = 0; i<k; i++){
            int aux = 0;
            for(char x: resultado.toCharArray()){
                aux+= (x-'0');
            }
            resultado = Integer.toString(aux);
        }
        return Integer.valueOf(resultado);
    }

    public static void main(String[] args) {
        sumDigitString sum = new sumDigitString();
        System.out.println(sum.getLucky("leetcode", 2));
    }
}
