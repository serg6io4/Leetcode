public class romanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        int previo = 0;
        int posterior = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char x = s.charAt(i);
            switch (x) {
                case 'I':
                    posterior = 1;
                    break;
                case 'V':
                    posterior = 5;
                    break;
                case 'X':
                    posterior = 10;
                    break;
                case 'L':
                    posterior = 50;
                    break;
                case 'C':
                    posterior = 100;   
                    break;
                case 'D':
                    posterior = 500;
                    break;
                case 'M':
                    posterior = 1000;
                    break;
            }
            if(previo>posterior){
                result -= posterior;
            
            }else{
                result += posterior;
            }
            previo = posterior;

        }
        return result;
    }

    public static void main(String[] args) {
        romanToInteger converter = new romanToInteger();
        
        // Casos de prueba
        String[] testCases = {"III", "IV", "IX", "LVIII", "MCMXCIV", "MMMCMXCIX"};
        int[] expectedResults = {3, 4, 9, 58, 1994, 3999};
        
        for (int i = 0; i < testCases.length; i++) {
            String roman = testCases[i];
            int expected = expectedResults[i];
            int result = converter.romanToInt(roman);
            
            // Imprime el resultado de cada prueba
            System.out.println("Roman: " + roman);
            System.out.println("Expected: " + expected);
            System.out.println("Result: " + result);
            System.out.println(result == expected ? "Test Passed" : "Test Failed");
            System.out.println();
        }
    }
}
