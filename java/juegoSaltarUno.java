public class juegoSaltarUno {

    public boolean canJump(int[] nums) {
        int maxReachable = 0; // Maximum reachable index
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReachable) {
                return false; // If current index is beyond the farthest reachable index
            }
            maxReachable = Math.max(maxReachable, i + nums[i]); // Update the farthest index reachable
            if (maxReachable >= nums.length - 1) {
                return true; // If we can reach the last index
            }
        }
        return false; // If we finish the loop and haven't returned true
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        juegoSaltarUno j = new juegoSaltarUno();
        System.out.println(j.canJump(nums));
    }
}
