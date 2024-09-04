import java.util.Arrays;
public class treeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length-2; i++) {
            int inicio = i + 1;
            int fin = nums.length -1;
            while(inicio < fin){
                int sum = nums[i] + nums[inicio] + nums[fin];
                if(Math.abs(sum-target)<Math.abs(closestSum-target)){
                    closestSum = sum;
                }
                if(sum > target){
                    fin --;
                }else if(sum < target){
                    inicio++;
                }else{
                    return sum;
                }
            }
        }
        return closestSum;
    }
}
