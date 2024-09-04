import java.util.ArrayList;
import java.util.List;

public class combinationBackTrack {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(result,new ArrayList<>(), n, k, 1);
        return result;
    }

    private void backtracking(List<List<Integer>> result, List<Integer> lista, int n, int k, int start) {
        if(lista.size()==k){
            result.add(new ArrayList<>(lista));
            return;
        }
        for(int i= start; i<=n; i++){
            lista.add(i);
            backtracking(result, lista, n, k, i+1);
            lista.remove(lista.size()-1);
        }
    }

    public static void main(String[] args) {
        combinationBackTrack comb = new combinationBackTrack();
        System.out.println(comb.combine(4,2));
    }
}
