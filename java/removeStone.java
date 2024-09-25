public class removeStone {
    public int removeStones(int[][] stones) {
        int eliminado = 0;
        for(int i = stones.length-1; i>= 0; i--){
            for(int j = i -1; j>=0; j--){
                if(stones[i][0] ==  stones[j][0] || stones[i][1] == stones[j][1]){
                    eliminado ++;
                    break;
                }
            }
        }
        return eliminado;
    }
    public static void main(String[] args) {
        // Ejemplo de arreglo stones
        int[][] stones = {
            {0, 1},
            {1, 0},
            {1, 1}
        };
        
        // Crear una instancia de la clase Main para llamar a removeStones
        removeStone main = new removeStone();
        int resultado = main.removeStones(stones);
        
        // Imprimir el resultado
        System.out.println("Número de piedras eliminadas: " + resultado);
    }
}
