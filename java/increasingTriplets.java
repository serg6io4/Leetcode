public class increasingTriplets {
    
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3){
            return false;
        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
    
        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] caso1 = {1,2,3,4,5};
        int[] caso2 = {5,4,3,2,1};
        int[] caso3 = {2,1,5,0,4,6};
        increasingTriplets it = new increasingTriplets();
        System.out.println(it.increasingTriplet(caso2));
    }
}
