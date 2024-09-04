import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class maximumProbability {

    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        Map<Integer,Map<Integer, Double>> grafo  = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            grafo.putIfAbsent(edges[i][0], new HashMap<>());
            grafo.putIfAbsent(edges[i][1], new HashMap<>());
            grafo.get(edges[i][0]).put(edges[i][1], succProb[i]);
            grafo.get(edges[i][1]).put(edges[i][0], succProb[i]); // Bidireccional
        }
        // Cola de prioridad para maximizar la probabilidad (usar inverso para max-heap)
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[1], a[1]));
        pq.offer(new double[]{start_node, 1.0});

        // Array para guardar las probabilidades máximas encontradas para cada nodo
        double[] maxProb = new double[n];
        maxProb[start_node] = 1.0;

        // Recorrer el grafo
        while (!pq.isEmpty()) {
            double[] curr = pq.poll();
            int currNode = (int) curr[0];
            double currProb = curr[1];

            // Si hemos llegado al nodo final, devolvemos la probabilidad acumulada
            if (currNode == end_node) {
                return currProb;
            }

            // Si la probabilidad actual es menor que la registrada, saltar
            if (currProb < maxProb[currNode]) {
                continue;
            }

            // Explorar los vecinos del nodo actual
            if (grafo.containsKey(currNode)) {
                for (Map.Entry<Integer, Double> neighbor : grafo.get(currNode).entrySet()) {
                    int nextNode = neighbor.getKey();
                    double edgeProb = neighbor.getValue();
                    double newProb = currProb * edgeProb;

                    // Si encontramos una probabilidad mayor, actualizar y añadir a la cola
                    if (newProb > maxProb[nextNode]) {
                        maxProb[nextNode] = newProb;
                        pq.offer(new double[]{nextNode, newProb});
                    }
                }
            }
        }

        // Si no llegamos al nodo final, devolver 0.0
        return 0.0;
    }
}
