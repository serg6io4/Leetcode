public class waterContainer {
    public int maxArea(int[] height) {
        int maxCapacity =  0;
        int left = 0;
        int rigth = height.length-1;
        while(left < rigth){
            int minHeight = Math.min(height[left], height[rigth]);
            int width = rigth-left;
            maxCapacity = Math.max(maxCapacity, width*minHeight);

            if(height[left]<height[rigth]){
                left++;
            }else{
                rigth--;
            }
        }
        return maxCapacity;
    }
    public static void main(String[] args) {
        waterContainer wc = new waterContainer();

        // Caso de prueba 1
        int[] heights1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result1 = wc.maxArea(heights1);
        System.out.println("Resultado esperado: 49, Resultado obtenido: " + result1);

        // Caso de prueba 2
        int[] heights2 = {1, 1};
        int result2 = wc.maxArea(heights2);
        System.out.println("Resultado esperado: 1, Resultado obtenido: " + result2);

        // Caso de prueba 3
        int[] heights3 = {4, 3, 2, 1, 4};
        int result3 = wc.maxArea(heights3);
        System.out.println("Resultado esperado: 16, Resultado obtenido: " + result3);

        // Caso de prueba 4
        int[] heights4 = {1, 2, 1};
        int result4 = wc.maxArea(heights4);
        System.out.println("Resultado esperado: 2, Resultado obtenido: " + result4);

        // Caso de prueba 5 (Array con un solo elemento)
        int[] heights5 = {5};
        int result5 = wc.maxArea(heights5);
        System.out.println("Resultado esperado: 0, Resultado obtenido: " + result5);

        // Caso de prueba 6 (Array vacío)
        int[] heights6 = {};
        int result6 = wc.maxArea(heights6);
        System.out.println("Resultado esperado: 0, Resultado obtenido: " + result6);
    }
}