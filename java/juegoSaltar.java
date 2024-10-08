public class juegoSaltar {

    public int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int minSaltos = 0;
        int i = 0;
        
        while (i + nums[i] < nums.length - 1) {
            int mejor = i;
            for (int j = i + 1; j <= i + nums[i] && j < nums.length; j++) {
                if (j + nums[j] > mejor + nums[mejor]) {
                    mejor = j;
                }
            }
            i = mejor;
            minSaltos++;
        }
        return minSaltos + 1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,0,1,4};
        juegoSaltar j = new juegoSaltar();
        System.out.println(j.jump(nums));
    }
}
