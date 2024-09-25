import java.util.HashMap;
import java.util.Map;

class largestStringNoRepit {
    
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> diccionario = new HashMap<>();
        int maxLength = 0;
        int inicio = 0;

        for (int fin = 0; fin < s.length(); fin++) {
            char x = s.charAt(fin);

            // Si el carácter ya está en el diccionario, mover el inicio después de la última aparición
            if (diccionario.containsKey(x)) {
                inicio = Math.max(inicio, diccionario.get(x) + 1);
            }

            // Actualizar la última posición del carácter
            diccionario.put(x, fin);

            // Calcular la longitud de la subsecuencia actual y actualizar maxLength si es mayor
            maxLength = Math.max(maxLength, fin - inicio + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Crear una instancia de largestStringNoRepit
        largestStringNoRepit solution = new largestStringNoRepit();
        
        // Casos de prueba
        System.out.println("Test 1 (\"abcabcbb\"): " + solution.lengthOfLongestSubstring("abcabcbb")); // Esperado: 3
        System.out.println("Test 2 (\"bbbbb\"): " + solution.lengthOfLongestSubstring("bbbbb")); // Esperado: 1
        System.out.println("Test 3 (\"pwwkew\"): " + solution.lengthOfLongestSubstring("pwwkew")); // Esperado: 3
        System.out.println("Test 4 (\"\"): " + solution.lengthOfLongestSubstring("")); // Esperado: 0
        System.out.println("Test 5 (\"abc\"): " + solution.lengthOfLongestSubstring("abc")); // Esperado: 3
        System.out.println("Test 6 (\"a\"): " + solution.lengthOfLongestSubstring("a")); // Esperado: 1
        System.out.println("Test 7 (\"anviaj\"): " + solution.lengthOfLongestSubstring("anviaj")); // Esperado: 4
        System.out.println("Test 8 (\"dvdf\"): " + solution.lengthOfLongestSubstring("dvdf")); // Esperado: 2
    }
}
