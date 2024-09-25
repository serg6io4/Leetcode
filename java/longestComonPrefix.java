public class longestComonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String resultado = strs[0];
        for(int i = 1; i<strs.length; i++){
            while(strs[i].indexOf(resultado) != 0){
                resultado = resultado.substring(0, resultado.length()-1);
                if(resultado.isEmpty()) return "";
            }
        }
        return resultado;
    }
}
