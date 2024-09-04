import java.util.HashSet;
import java.util.Set;

public class walkingRobot {
    public int robotSim(int[] commands, int[][] obstacles) {
        //Direcciones: arriba, derecha, abajo , izquierda
        int [][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        int x = 0, y = 0 ;
        int direccion = 0;
        int maximaDistancia = 0;

        //Se meten en un set para que no haya coordenadas repetidas y se más fácil comprobar
        Set<String> obstacleSet = new HashSet<>();
        for(int[] obstacle :  obstacles){
            obstacleSet.add(obstacle[0] +","+obstacle[1]);
        }

        for(int command: commands){
            if(command == -1){
                direccion = (direccion +1) % 4;
            }else if(command == -2){
                direccion = (direccion + 3) % 4;
            }else{
                //Establezco la direccion
                int dx = directions[direccion][0];
                int dy = directions[direccion][1];
                
                //Voy sumando la dirección de uno en uno, comprobando si el siguiente es obstáculo, si lo es paro
                for(int i = 0; i < command; i++){
                    int nextX = x + dx;
                    int nextY = y + dy;

                    if(obstacleSet.contains(nextX + "," +nextY)) break;

                    x = nextX;
                    y = nextY;

                    maximaDistancia = Math.max(maximaDistancia, x*x + y*y);
                }
            }
        }

        return maximaDistancia;
    }

    public static void main(String[] args) {
        walkingRobot sim = new walkingRobot();
        int[] commands = {4, -1, 4, -2, 4};
        int[][] obstacles = {{2, 4}};
        System.out.println(sim.robotSim(commands, obstacles)); // Debería imprimir 65
    }

}
