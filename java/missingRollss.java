
import java.util.Arrays;

public class missingRollss {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int teorico = mean * (n+rolls.length);
        int practico = 0;
        for(int i: rolls){
            practico += i;
        }
        int sumFaltante = teorico -practico;
        if(sumFaltante < n || sumFaltante > n * 6){
            return (new int[]{});
        }

        int[] result = new int[n];
        // Inicializar cada lanzamiento en 1
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }

        // Restar el valor mínimo que ya hemos asignado a cada lanzamiento
        sumFaltante -= n;

        // Distribuir el resto de la suma faltante
        int i = 0;
        while (sumFaltante > 0) {
            // Determinar cuánto podemos agregar a result[i] sin pasar de 6
            int incremento = Math.min(5, sumFaltante);
            result[i] += incremento;
            sumFaltante -= incremento;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        missingRollss miss = new missingRollss();
        int[] rolls = new int[]{3,2,4,3};
        System.out.println(Arrays.toString(miss.missingRolls(rolls, 4, 2)));
    }
}
