import java.util.Arrays;

public class sortsColors {

    //Se puede mejorar
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    // Intercambiar nums[i] y nums[j]
                    int aux = nums[i];
                    nums[i] = nums[j];
                    nums[j] = aux;
                } 
            }
        }
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase sortsColors
        sortsColors s = new sortsColors();
        // Array de enteros a ordenar
        int[] nums = {2, 0, 2, 1, 1, 0};
        // Ordenar el array usando el método sortColors
        s.sortColors(nums);
        // Convertir el array de enteros a un array de cadenas de texto
        String[] stringArray = Arrays.stream(nums)
                                     .mapToObj(Integer::toString)
                                     .toArray(String[]::new);
        // Imprimir el array de cadenas de texto
        System.out.println(Arrays.toString(stringArray));
    }
    
}
