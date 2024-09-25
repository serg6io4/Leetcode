import java.util.HashSet;
import java.util.Set;

public class numberConsistentString {

    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> diccionario = new HashSet<>();
        for(char x : allowed.toCharArray()){
            diccionario.add(x);
        }
        int result = 0;
        for(String word : words){
            boolean isConsistent = true;
            for(char elem : word.toCharArray()) {
                if(!diccionario.contains(elem)){
                    isConsistent = false;
                    break;
                }
            }
            if(isConsistent){
                result++;
            }
        }
        return result; 
    }

    public void main(String[] args) {
        numberConsistentString numb = new numberConsistentString();
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(numb.countConsistentStrings("ab", words));
    }
}
