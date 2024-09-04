import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class treeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lista = new ArrayList<>();
        Arrays.sort(nums);
        
        for (int resultado = 0; resultado < nums.length - 2; resultado++) {
            // Evitar duplicados para el primer número
            if (resultado > 0 && nums[resultado] == nums[resultado - 1]) {
                continue;
            }
            
            int inicio = resultado + 1;
            int fin = nums.length - 1;
            
            while (inicio < fin) {
                int sum = nums[resultado] + nums[inicio] + nums[fin];
                
                if (sum == 0) {
                    lista.add(new ArrayList<>(Arrays.asList(nums[resultado], nums[inicio], nums[fin])));
                    
                    // Evitar duplicados para los números segundo y tercero
                    while (inicio < fin && nums[inicio] == nums[inicio + 1]) {
                        inicio++;
                    }
                    while (inicio < fin && nums[fin] == nums[fin - 1]) {
                        fin--;
                    }
                    inicio++;
                    fin--;
                } else if (sum > 0) {
                    fin--;
                } else {
                    inicio++;
                }
            }
        }
        
        return lista;
    }

    public static void main(String[] args) {
        treeSum sum = new treeSum();

        // Caso de prueba 1
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result1 = sum.threeSum(nums1);
        System.out.println("Caso de prueba 1: " + result1);

        // Caso de prueba 2
        int[] nums2 = {0, 1, 1};
        List<List<Integer>> result2 = sum.threeSum(nums2);
        System.out.println("Caso de prueba 2: " + result2);

        // Caso de prueba 3
        int[] nums3 = {0, 0, 0};
        List<List<Integer>> result3 = sum.threeSum(nums3);
        System.out.println("Caso de prueba 3: " + result3);

        // Caso de prueba 4
        int[] nums4 = {-1, 2, 1, -4};
        List<List<Integer>> result4 = sum.threeSum(nums4);
        System.out.println("Caso de prueba 4: " + result4);

        // Caso de prueba 5
        int[] nums5 = {1, 2, -2, -1};
        List<List<Integer>> result5 = sum.threeSum(nums5);
        System.out.println("Caso de prueba 5: " + result5);

        // Caso de prueba 6: array vacío
        int[] nums6 = {};
        List<List<Integer>> result6 = sum.threeSum(nums6);
        System.out.println("Caso de prueba 6: " + result6);

        // Caso de prueba 7: array sin triplets que sumen a cero
        int[] nums7 = {1, 2, 3, 4, 5};
        List<List<Integer>> result7 = sum.threeSum(nums7);
        System.out.println("Caso de prueba 7: " + result7);
    }
}

