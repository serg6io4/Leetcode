import java.util.ArrayList;
import java.util.List;

public class permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean [] used = new boolean[nums.length];
        backtracking(result, nums, new ArrayList<>(), used);
        return result;
    }

    private void backtracking(List<List<Integer>> result, int[] nums, List<Integer> aux, boolean [] used) {
        if(aux.size() == nums.length && !result.contains(aux)){
            result.add(new ArrayList<>(aux));
            return;
        }
        for(int i= 0; i < nums.length; i++){
            if(!used[i]){
                aux.add(nums[i]);
                used[i]=true;
                backtracking(result, nums, aux, used);
                used[i]=false;
                aux.remove(aux.size()-1);
            }
            
        }
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase
        permutations perm = new permutations();

        // Definir el array de entrada
        int[] nums = {1, 2, 3};

        // Llamar al método permute
        List<List<Integer>> result = perm.permute(nums);

        // Imprimir los resultados
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
}
