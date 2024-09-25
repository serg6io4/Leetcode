

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class uncommonWords {
    public String[] uncommonFromSentences(String s1, String s2) {
        String cadena = s1 + " " + s2;
        Map<String, Integer> dict = new TreeMap<>();
        for(String x : cadena.split(" ")){
            if(dict.containsKey(x)){
                dict.put(x, dict.get(x)+1);
            }else{
                dict.put(x, 1);
            }
        }
        List<String> lista = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : dict.entrySet()) {
            if (entry.getValue() == 1) {
                lista.add(entry.getKey()); // Añadir solo las palabras con frecuencia 1
            }
        }
        
        // Convertir la lista a un arreglo de String y devolverlo
        return lista.toArray(new String[0]);
    }

    public void main(String[] args) {
        uncommonWords u = new uncommonWords();
        System.out.println(Arrays.toString(u.uncommonFromSentences("this apple is sweet", "this apple is sour")));
    }
}
