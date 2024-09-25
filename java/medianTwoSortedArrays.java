
class medianTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int[] mergedArray = new int[nums1.length + nums2.length];
        int k = 0; // Índice para el array combinado

        // Mientras ambos índices estén dentro del rango de sus respectivos arrays
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        // Si quedan elementos en arr1, agréguelos
        while (i < nums1.length) {
            mergedArray[k++] = nums1[i++];
        }

        // Si quedan elementos en arr2, agréguelos
        while (j < nums2.length) {
            mergedArray[k++] = nums2[j++];
        }

        int n = mergedArray.length;
        if (!(n%2 == 0)) {
            return mergedArray[n/2];
        }else{
            return (mergedArray[n/2]+mergedArray[(n/2)-1]) / 2.0;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 4, 6, 8, 9};
        medianTwoSortedArrays obj = new medianTwoSortedArrays();
        double median = obj.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median); // Debería imprimir la mediana
    }
}
