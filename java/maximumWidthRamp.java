import java.util.Stack;

public class maximumWidthRamp {

    /*
    public int maxWidthRamp(int[] nums) {
        int ancho = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]<=nums[j]){
                    ancho = Math.max(ancho, j-i);
                }
            }
        }
        return ancho;
    }
    */
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        
        // Crear una pila decreciente
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                stack.push(i);
            }
        }

        int maxRamp = 0;

        // Recorrer desde el final y calcular la máxima anchura de la rampa
        for (int j = n - 1; j >= 0; j--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[j]) {
                maxRamp = Math.max(maxRamp, j - stack.pop());
            }
        }
        
        return maxRamp;
}

    public static void main(String[] args) {
        maximumWidthRamp mwr = new maximumWidthRamp();
        int[] nums = {6,0,8,2,1,5};
        int[] nums1 = {9,8,1,0,1,9,4,0,4,1};
        System.out.println(mwr.maxWidthRamp(nums1));
    }
}
