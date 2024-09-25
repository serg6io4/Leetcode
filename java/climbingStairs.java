
public class climbingStairs {

    public int climbStairs(int n) {
        if(n>=1 || n<=45){
            if (n == 1) return 1;
            if (n == 2) return 2;

            // Inicialización de las variables para almacenar los resultados de los dos escalones anteriores
            int prev1 = 1; // f(n-1) para n=1
            int prev2 = 2; // f(n-2) para n=2
            int current = 0; // Variable para el valor actual

            // Iterar desde el paso 3 hasta n
            for (int i = 3; i <= n; i++) {
                current = prev1 + prev2; // Calcula el número de formas para el escalón i
                prev1 = prev2; // Mueve prev2 a prev1
                prev2 = current; // Mueve current a prev2
            }

            return current;
        }else{
            return 0;
        }
    }
}
