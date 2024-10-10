
import java.util.Arrays;

public class searchFirstLast {
    
    public int[] searchRange(int[] nums, int target) {
        int[] sol = {-1, -1};
        
        if (nums.length == 0) return sol;
    
        // Find the first occurrence
        int bajo = 0;
        int alto = nums.length - 1;
        
        while (bajo <= alto) {
            int mid = bajo + (alto - bajo) / 2;
            if (nums[mid] >= target) {
                alto = mid - 1;
            } else {
                bajo = mid + 1;
            }
        }
        
        // Check if the element was found
        if (bajo < nums.length && nums[bajo] == target) {
            sol[0] = bajo;
        } else {
            return sol;  // If not found, return [-1, -1]
        }
    
        // Find the last occurrence
        alto = nums.length - 1;
        while (bajo <= alto) {
            int mid = bajo + (alto - bajo) / 2;
            if (nums[mid] <= target) {
                bajo = mid + 1;
            } else {
                alto = mid - 1;
            }
        }
        
        sol[1] = alto;
        return sol;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5,6};
        searchFirstLast sfl = new searchFirstLast();
        System.out.println(Arrays.toString(sfl.searchRange(nums, 4)));
    }
}
