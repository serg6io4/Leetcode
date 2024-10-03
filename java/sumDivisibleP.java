import java.util.HashMap;

public class sumDivisibleP {
    
    public int minSubarray(int[] nums, int p) {
        int sol = -1;
        int total = 0;
        for(int num : nums){
            total+= num;
        }
        int objetivo = total % p;
        if(objetivo == 0){
            return 0;
        }
        //Si no es cero hay que buscar lo mínimo que hay que quitar para que de bien
         // Mapa para guardar el índice de los prefijos modulares
        HashMap<Integer, Integer> modIndexMap = new HashMap<>();
        modIndexMap.put(0, -1); // Prefijo vacío antes del primer elemento
        
        int currentSum = 0;
        int minLength = nums.length;
        
        // Iterar sobre el array para encontrar el subarray más pequeño que se puede eliminar
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            int currentMod = currentSum % p;
            
            // Queremos encontrar un prefijo tal que (currentMod - targetMod) % p == 0
            int targetPrefix = (currentMod - objetivo + p) % p;
            
            if (modIndexMap.containsKey(targetPrefix)) {
                minLength = Math.min(minLength, i - modIndexMap.get(targetPrefix));
            }
            
            // Guardar el índice del prefijo modular actual
            modIndexMap.put(currentMod % p, i);
        }
        
        return minLength == nums.length ? -1 : minLength;
    }
}
