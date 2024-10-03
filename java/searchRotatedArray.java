public class searchRotatedArray {
    
    public int search(int[] nums, int target) {
        int encontrado = -1;
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            if(nums[i] == target) return i;
            if(nums[j] == target) return j;
            i++;
            j--;
        }
        return encontrado;
    }

    public void main(String[] args) {
        searchRotatedArray r = new searchRotatedArray();
        int[] nums = {1};
        System.out.println(r.search(nums, 1));
    }

}
