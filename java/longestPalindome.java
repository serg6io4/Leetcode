public class longestPalindome {

    private boolean esPalindroma(String substring) {
        int left = 0;               // Índice al inicio de la cadena
        int right = substring.length() - 1; // Índice al final de la cadena

        while (left < right) {      // Comparar desde los extremos hacia el centro
            if (substring.charAt(left) != substring.charAt(right)) {
                return false;       // Si hay una discrepancia, no es un palíndromo
            }
            left++;
            right--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String resultado = "";
        String auxiliar ="";
        char [] aux = s.toCharArray();
        for (int i = 0; i < aux.length; i++){
            for(int j= i; j < aux.length; j++){
                auxiliar = s.substring(i, j+1);
                if(esPalindroma(auxiliar)){
                    if(auxiliar.length()>resultado.length()){
                        resultado = auxiliar;
                    }
                }
            }
        }
        return resultado;   
    }
    public static void main(String[] args) {
        longestPalindome lp = new longestPalindome();

        // Test 1: Palíndromo en medio de la cadena
        String test1 = "babad";
        String result1 = lp.longestPalindrome(test1);
        System.out.println("Test 1 - Input: " + test1 + " | Expected: bab or aba | Result: " + result1);

        // Test 2: Toda la cadena es un palíndromo
        String test2 = "racecar";
        String result2 = lp.longestPalindrome(test2);
        System.out.println("Test 2 - Input: " + test2 + " | Expected: racecar | Result: " + result2);

        // Test 3: Cadena con todos los caracteres iguales
        String test3 = "aaaa";
        String result3 = lp.longestPalindrome(test3);
        System.out.println("Test 3 - Input: " + test3 + " | Expected: aaaa | Result: " + result3);

        // Test 4: Palíndromo al principio de la cadena
        String test4 = "abacdfgdcaba";
        String result4 = lp.longestPalindrome(test4);
        System.out.println("Test 4 - Input: " + test4 + " | Expected: aba | Result: " + result4);

        // Test 5: Palíndromo al final de la cadena
        String test5 = "cbbd";
        String result5 = lp.longestPalindrome(test5);
        System.out.println("Test 5 - Input: " + test5 + " | Expected: bb | Result: " + result5);

        // Test 6: Cadena sin palíndromos (más allá de los caracteres individuales)
        String test6 = "abcdefg";
        String result6 = lp.longestPalindrome(test6);
        System.out.println("Test 6 - Input: " + test6 + " | Expected: a (o cualquier carácter) | Result: " + result6);

        // Test 7: Cadena vacía
        String test7 = "";
        String result7 = lp.longestPalindrome(test7);
        System.out.println("Test 7 - Input: \"" + test7 + "\" | Expected: \"\" | Result: \"" + result7 + "\"");

        // Test 8: Cadena con un solo carácter
        String test8 = "a";
        String result8 = lp.longestPalindrome(test8);
        System.out.println("Test 8 - Input: " + test8 + " | Expected: a | Result: " + result8);

        // Test 9: Palíndromo en el medio de la cadena
        String test9 = "xabax";
        String result9 = lp.longestPalindrome(test9);
        System.out.println("Test 9 - Input: " + test9 + " | Expected: xabax | Result: " + result9);
    }

        
}

