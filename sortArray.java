public class sortArray {
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quicksort(int[] nums, int low, int high) {
        while (low < high) {
            // Optimización: Mediana de tres para elegir el pivote
            int pi = medianOfThreePartition(nums, low, high);

            // Optimización: Recursión de cola
            if (pi - low < high - pi) {
                quicksort(nums, low, pi - 1);
                low = pi + 1;  // Reduce el tamaño de la pila
            } else {
                quicksort(nums, pi + 1, high);
                high = pi - 1;
            }
        }
    }

    private int medianOfThreePartition(int[] nums, int low, int high) {
        int mid = low + (high - low) / 2;
        if (nums[low] > nums[mid]) {
            swap(nums, low, mid);
        }
        if (nums[low] > nums[high]) {
            swap(nums, low, high);
        }
        if (nums[mid] > nums[high]) {
            swap(nums, mid, high);
        }

        // Elige el valor medio como pivote
        swap(nums, mid, high);
        int pivot = nums[high];

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, high);
        return i + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        sortArray s = new sortArray();
        int[] array = {10, 7, 8, 9, 1, 5};
        int n = array.length;
        s.sortArray(array);
        System.out.println("Array ordenado: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
