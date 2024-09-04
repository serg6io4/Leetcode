import java.util.ArrayList;
import java.util.List;

public class combinationSumm {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
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
            lista.add(candidates[i]);
            backtracking(result, lista, candidates, target-candidates[i], i);
            lista.remove(lista.size()-1);
        }
    }

    public static void main(String[] args) {
        combinationSumm cs = new combinationSumm();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = cs.combinationSum(candidates, target);
        System.out.println(result);  // Debería imprimir [[2, 2, 3], [7]]
    }
}
