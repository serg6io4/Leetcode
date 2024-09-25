
import java.util.Arrays;

//[O(n*q)]
public class xorQuerieSubArray {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        int i = 0;
        while(i<queries.length){
            int aux = 0;
            int start = queries[i][0];
            int end = queries[i][1];
            for(int j = start; j <= end; j++){
                aux ^= arr[j];
            }
            result[i] = aux;
            i++;
        }
        return result;
    }
    //Manera eficiente, donde se calcula primero el array de xor y dependiendo de las coordenadas start y end vas haciendo xor calculados[O(n+q)]
    /*
      public int[] xorQueries(int[] arr, int[][] queries) {
            int n=arr.length;
            int[] pre=new int[n];
            pre[0]=arr[0];
            for(int i=1;i<n;i++) {
                pre[i]=pre[i-1]^arr[i];
            }
            int[] res=new int[queries.length];
            for(int k=0;k<queries.length;k++) {
                int i=queries[k][0];
                int j=queries[k][1];
                if(i==0) {
                    res[k]=pre[j];
                } else {
                    res[k]=pre[j]^pre[i-1];
                }
            }
            return res;
        }
     */

    public void main(String[] args) {
        xorQuerieSubArray xor = new xorQuerieSubArray();
        int[] arr = {1,3,4,8};
        int[][] queries = {{0,1},{1,2},{0,3},{3,3}};
        System.out.println(Arrays.toString(xor.xorQueries(arr, queries)));
    }
}
