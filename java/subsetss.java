import java.util.ArrayList;
import java.util.List;

public class subsetss {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtracking(List<List<Integer>> result, List<Integer> lista, int[] nums, int start) {
        result.add(new ArrayList<>(lista)); 
        for (int i = start; i < nums.length; i++) {
            lista.add(nums[i]);  
            backtracking(result, lista, nums, i + 1);  
            lista.remove(lista.size() - 1);  
        }
    }

    public static void main(String[] args) {
        subsetss sub = new subsetss();
        int[] numeros = new int[]{1,2,3};
        System.out.println(sub.subsets(numeros));
    }

}
