
import java.util.Arrays;


public class MergedArraysSorted {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;  
        int [] aux = new int[n+m];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                aux[k] = nums1[i];
                k++;
                i++;
            }else{
                aux[k] = nums2[j];
                k++;
                j++;
            }
        }
        while (i < m) {
            aux[k] = nums1[i];
            i++;
            k++;
        }
    
        while (j < n) {
            aux[k] = nums2[j];
            j++;
            k++;
        }
        for(int l = 0; l < m + n; l++) {
            nums1[l] = aux[l];
        }
    }
    public static void main(String[] args) {
        MergedArraysSorted prueba = new MergedArraysSorted();
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[]  nums2 = new int[]{2,5,6};
        prueba.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
