
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class rankTransform{

    public int[] arrayRankTransform(int[] arr) {
        int[] resultado = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        
        Map<Integer, Integer> dic= new HashMap<>();
        int rank = 1;
        for (int n: arr) {
            if(!dic.containsKey(n)){
                dic.put(n, rank);
                rank++;
            }
            
        }
        for(int i = 0; i< resultado.length; i++){
            resultado[i] = dic.get(resultado[i]);
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] nums = {40,10,20,30};
        rankTransform r = new rankTransform();
        System.out.println(Arrays.toString(r.arrayRankTransform(nums)));
    }
}