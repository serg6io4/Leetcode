
import java.util.Arrays;
import java.util.List;

class maximumDistance {

    public static int maxDistance(List<List<Integer>> arrays) {
        if (arrays == null || arrays.size() < 2) {
            return 0; // Si hay menos de dos arreglos, la distancia máxima es 0
        }

        // Inicializar valores extremos de los arreglos
        int minValue = arrays.get(0).get(0);
        int maxValue = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDistance = 0;

        // Recorrer los arreglos a partir del segundo
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> list = arrays.get(i);
            int currentMin = list.get(0);
            int currentMax = list.get(list.size() - 1);

            // Calcular la distancia máxima usando valores de arreglos diferentes
            maxDistance = Math.max(maxDistance, Math.abs(currentMax - minValue));
            maxDistance = Math.max(maxDistance, Math.abs(maxValue - currentMin));

            // Actualizar los valores extremos globales
            minValue = Math.min(minValue, currentMin);
            maxValue = Math.max(maxValue, currentMax);
        }

        return maxDistance;
    }
    public static void main(String[] args) {
        // Crear una instancia de maximumDistance
        maximumDistance md = new maximumDistance();

        // Definir algunas listas de ejemplo para probar
        List<List<Integer>> arrays1 = Arrays.asList(
            Arrays.asList(1, 3, 5),
            Arrays.asList(2, 6, 8),
            Arrays.asList(0, 4, 7)
        );

        List<List<Integer>> arrays2 = Arrays.asList(
            Arrays.asList(1, 1, 1),
            Arrays.asList(1, 1),
            Arrays.asList(1, 1, 1, 1)
        );

        List<List<Integer>> arrays3 = Arrays.asList(
            Arrays.asList(10, 20),
            Arrays.asList(15, 25, 35),
            Arrays.asList(5, 30, 40)
        );

        // Probar el método maxDistance con diferentes listas
        System.out.println("Max Distance (arrays1): " + md.maxDistance(arrays1));
        System.out.println("Max Distance (arrays2): " + md.maxDistance(arrays2));
        System.out.println("Max Distance (arrays3): " + md.maxDistance(arrays3));
    }
}