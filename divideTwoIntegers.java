public class divideTwoIntegers {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        // Determinar el signo del resultado
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        // Convertimos el dividendo y divisor a valores negativos para evitar problemas de desbordamiento
        dividend = (dividend > 0) ? -dividend : dividend;
        divisor = (divisor > 0) ? -divisor : divisor;

        int count = 0;

        // Implementamos la resta iterativa
        while (dividend <= divisor) {
            dividend -= divisor;
            count++;
        }

        // Devolvemos el resultado con el signo apropiado
        return sign * count;
    }

    public static void main(String[] args) {
        divideTwoIntegers j = new divideTwoIntegers();
        System.out.println(j.divide(10, 3));
    }
}
