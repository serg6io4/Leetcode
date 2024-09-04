public class findNearestPalindrome {
    
    public boolean esPalindromo(String x) {
        int i = 0, j = x.length() - 1;
        while (i < j) {
            if (x.charAt(i) != x.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //Aquí vamos recorriendo todo los numeros hasta llegar al que nos han dado
    public String nearestPalindromic(String n) {
        if(n.length()>=1 && n.length()<=18){
            long number = Long.parseLong(n);
            long menor = number - 1;
            long mayor = number + 1;
            while(true){
                if(esPalindromo(Long.toString(menor))) return Long.toString(menor);
                if(esPalindromo(Long.toString(mayor))) return Long.toString(mayor);
                menor--;
                mayor++;
            }
        }
        return "No existe";
    }

    public static void main(String[] args) {
        findNearestPalindrome finder = new findNearestPalindrome();

        // Ejemplo 1
        String input1 = "807045053224792883";
        String actualOutput1 = finder.nearestPalindromic(input1);
        System.out.println("Input: " + input1 + " | Output: " + actualOutput1);

        // Ejemplo 2
        String input2 = "1";
        String expectedOutput2 = "0";
        String actualOutput2 = finder.nearestPalindromic(input2);
        System.out.println("Input: " + input2 + " | Output: " + actualOutput2 + " | Expected: " + expectedOutput2);
    }
}
