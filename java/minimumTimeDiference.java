import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class minimumTimeDiference {

    public int findMinDifference(List<String> timePoints) {
        int minimo = Integer.MAX_VALUE;
        List<Integer> minutos = new ArrayList<>();
        for(String x : timePoints){
                String[] parts = x.split(":");
                int hora = Integer.parseInt(parts[0]);
                int minuto = Integer.parseInt(parts[1]);
                minutos.add(hora*60 + minuto);
        }
        Collections.sort(minutos);
        for(int i=1; i < minutos.size(); i++){
            int minimum = minutos.get(i)-minutos.get(i-1);
            minimo = Math.min(minimo, minimum);
        }

        int circularDiff = (1440 - minutos.get(minutos.size() - 1)) + minutos.get(0);  // 1440 minutos en un día
        
        // Actualizar la mínima diferencia considerando la circularidad
        minimo = Math.min(minimo, circularDiff);

        return minimo;
    }

    public void main(String[] args) {
        minimumTimeDiference timert = new minimumTimeDiference();
        List<String> lista = new ArrayList<>();
        lista.add("00:00");
        lista.add("23:59");
        lista.add("00:00");
        System.out.println(timert.findMinDifference(lista));
    }
}
