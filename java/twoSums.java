
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class twoSums {
    /*public int[] twoSum(int[] nums, int target) {
        int [] solucion = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    solucion[0] = i;
                    solucion[1]= j;
                    break;
                }
            }
        }
        return solucion;
    }*/
    //La manera más eficiente es con HashMap
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numeros = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(numeros.containsKey(complement)){
                return new int [] {numeros.get(complement), i};
            }
            numeros.put(nums[i], i);
        }
        throw  new IllegalArgumentException("No existe dos numeros para ese target");
    }

    public static void main(String[] args) {
        twoSums solution = new twoSums();

        // Caso de prueba 1: Devolver true
        int[] numeros = {3,3};
        System.out.println(Arrays.toString(solution.twoSum(numeros, 6))); 
    }
}
