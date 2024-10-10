public class search2DMatrix {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int f = matrix.length;//Numero de filas
        int c = matrix[0].length;//Numero de columnas
        int bajo = 0;
        int alto = (f*c)-1;
        while(bajo <= alto){
            int mid = bajo + (alto - bajo) / 2;

            if (matrix[mid/c][mid%c] == target) return true;
 
            if (matrix[mid/c][mid%c] < target) bajo = mid + 1;
 
            else alto = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,3},{4,5,6,7},{8,9,10,11}};
        search2DMatrix sm = new search2DMatrix();
        System.out.println(sm.searchMatrix(matrix, 12));
    }
}
