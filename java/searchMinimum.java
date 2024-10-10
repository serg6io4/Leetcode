
public class searchMinimum {
    
    //Version O(n*logn)
    /*
        public int findMin(int[] nums) {
            Arrays.sort(nums);
            return nums[0];
        }
    */
    public int findMin(int[] nums){
        int minimo = Integer.MAX_VALUE;
        int bajo = 0;
        int alto = nums.length-1;
        while(bajo <= alto){
            if(nums[bajo] < minimo){
                minimo = nums[bajo];
            }
            if(nums[alto]< minimo){
                minimo = nums[alto];
            }
            bajo++;
            alto--;
        }
        return minimo;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        searchMinimum sm = new searchMinimum();
        System.out.println(sm.findMin(nums));
    }
    
}
