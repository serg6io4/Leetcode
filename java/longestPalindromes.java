import java.util.HashMap;
import java.util.Map;

public class longestPalindromes {
    
    public int longestPalindrome(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        for(char c : s.toCharArray()){
            if(dic.containsKey(c)){
                dic.put(c, dic.get(c)+1);
            }else{
                dic.put(c, 1);
            }
        }
        boolean impares = false;
        int total = 0;
        for(char c : dic.keySet()){
            if(dic.get(c)%2 == 0){
                total += dic.get(c);
            }else{
                total+= dic.get(c)-1;
                impares = true;
            }
        }
        if(impares){
            total+=1;
        }

        return total;
    }

    public static void main(String[] args) {
        longestPalindromes l = new longestPalindromes();
        System.out.println(l.longestPalindrome("abccccdd"));
    }
}
