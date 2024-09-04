public class esPalindromo {
    public boolean isPalindrome(int x) {
        // Si el número es negativo o termina en 0 (pero no es 0), no puede ser un palíndromo
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
    
        int original = x;  // Guardar el número original
        int reversed = 0;
    
        while (x != 0) {
            int digit = x % 10;  // Obtener el último dígito
            reversed = reversed * 10 + digit;  // Construir el número invertido
            x /= 10;  // Eliminar el último dígito del número original
        }
    
        return original == reversed;  // Comparar el número original con el invertido
    }
}
