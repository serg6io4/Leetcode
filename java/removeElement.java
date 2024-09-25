public class removeElement {
    
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        // Example usage
        removeElement re = new removeElement();
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 4};
        int k = re.removeElement(nums, 3);

        // Output the results
        System.out.println("Number of unique elements: " + k);
        System.out.print("Unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
