import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeInterval {

    public static int[][] merge(int[][] intervals) {
        if(intervals.length == 0) return new int[0][0];
        List<int[]> merged = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] actualInter = intervals[0];
        for(int i = 1; i< intervals.length; i++){
            if(intervals[i][0]<=actualInter[1]){
                //aumento el intervalo
                actualInter[1] = Math.max(actualInter[1], intervals[i][1]);
            }else{
                merged.add(actualInter);
                actualInter = intervals[i];
            }
        }
        merged.add(actualInter);
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] mergedIntervals = mergeInterval.merge(intervals);

        // Imprimir los intervalos combinados
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
