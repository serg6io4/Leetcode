
public class removeDuplicateArray {
    
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        // Example usage
        removeDuplicateArray re = new removeDuplicateArray();
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 4};
        int k = re.removeDuplicates(nums);

        // Output the results
        System.out.println("Number of unique elements: " + k);
        System.out.print("Unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
