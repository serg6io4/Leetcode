
import java.util.Arrays;

public class searchRotatedArrayII {
    
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0;
        int d = nums.length-1;
        while(i <= d){
            int m = i + (d - i) / 2;

            if (nums[m] == target)
                return true;
 
            if (nums[m] < target)
                i = m + 1;
 
            else
                d = m - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,6,7,1,2};
        searchRotatedArrayII rota = new searchRotatedArrayII();
        System.out.println(rota.search(nums, 0));
    }
}
