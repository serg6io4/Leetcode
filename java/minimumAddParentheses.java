public class minimumAddParentheses{

    public int minAddToMakeValid(String s) {
        if(s.isEmpty()) return 0;
        int balanceado = 0;
        int inserto = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                balanceado++; 
            }else{
                balanceado--;
            } 
            
            if(balanceado<0){
                inserto++;
                balanceado = 0;
            }
        }
        return inserto + balanceado;
    }

    public static void main(String[] args) {
        minimumAddParentheses ad = new minimumAddParentheses();
        System.out.println(ad.minAddToMakeValid("()))(("));
    }
}