public class intToString {
    public int myAtoi(String s) {
        int result = 0;
        int index = 0;
        int sign = 1;
        int length = s.length();

        //Con esto se ignora los espacios blancos iniciales
        while(index< length && s.charAt(index) == ' ') index++;

        //con esto buscamos el signo
        if(index<length){
            char primero = s.charAt(index);
            if(primero == '-'){
                sign = -1;
                index++;
            }else if(primero == '+'){
                index++;
            }
        }

        while (index < length && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            
            // Verificar si el resultado se desbordará
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        intToString converter = new intToString();

        // Pruebas
        String[] testCases = {
            "42",             // Normal
            "   -42",         // Espacios delante del signo negativo
            "4193 with words", // Palabras después de números
            "words and 987",  // Palabras delante de números
            "+5",             // Signo positivo
            "-a123",          // Signo negativo seguido de letras
            "123abc",         // Números seguidos de letras
            "abc123",         // Letras seguidas de números
            "000123",         // Números con ceros a la izquierda
            "  +00123abc"     // Espacios, signo positivo, ceros a la izquierda, y letras
        };

        for (String testCase : testCases) {
            int result = converter.myAtoi(testCase);
            System.out.println("Input: \"" + testCase + "\" => Output: " + result);
        }
    }
}
