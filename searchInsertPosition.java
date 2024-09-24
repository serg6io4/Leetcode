public class searchInsertPosition {
    
    public int searchInsert(int[] nums, int target) {
        return buscar(nums, (nums.length/2), 0, nums.length-1, target);
    }

    private int buscar(int[] nums, int i, int left, int right, int target) {
        // Caso base: cuando ya no hay más elementos que buscar, devolvemos el índice donde debería insertarse
        if (left > right) {
            return left;
        }

        // Si encontramos el target, devolvemos su índice
        if (nums[i] == target) {
            return i;
        }

        // Si el valor en nums[i] es mayor que el target, buscar en la mitad izquierda
        if (nums[i] > target) {
            return buscar(nums, left + (i - left) / 2, left, i - 1, target);
        }

        // Si el valor en nums[i] es menor que el target, buscar en la mitad derecha
        return buscar(nums, i + 1 + (right - i) / 2, i + 1, right, target);
    }

    public void main(String[] args) {
        searchInsertPosition et = new searchInsertPosition();
        int[] numeros = {1,2,3,4,5,6};
        System.out.println(searchInsert(numeros, 2));
    }
}
