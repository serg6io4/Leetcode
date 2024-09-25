public class firstOcurrenceString {

    public int strStr(String haystack, String needle) {
        int longitud = needle.length();
        boolean encontrado = false;
        int tam = haystack.length();
        int resultado = tam;
        for(int i = 0; i<tam; i++){
            if(tam-i < longitud) break;
            if(haystack.substring(i, i+longitud).equals(needle)){
                encontrado = true;
                resultado = Math.min(resultado, i);
            }
        }
        return (encontrado)? resultado : -1;
    }

    public void main(String[] args) {
        firstOcurrenceString fit = new firstOcurrenceString();
        System.out.println(fit.strStr("sadbutsad", "sad"));
    }
}
