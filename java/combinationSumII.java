import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSumII {
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(result,new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtracking(List<List<Integer>> result, List<Integer> lista, int[] candidates, int target, int start) {
        if(target == 0){
            result.add(new ArrayList<>(lista));
            return;
        }
        if(target < 0) return;

        for(int i = start; i < candidates.length; i++){
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            lista.add(candidates[i]);
            backtracking(result, lista, candidates, target-candidates[i], i+1);
            lista.remove(lista.size()-1);
        }
    }
    public static void main(String[] args) {
        combinationSumII cs = new combinationSumII();
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> result = cs.combinationSum2(candidates, target);
        System.out.println(result);  // Debería imprimir [[2, 2, 3], [7]]
    }
}
