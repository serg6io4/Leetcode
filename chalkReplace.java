public class chalkReplace {
    
    public int chalkReplacer(int[] chalk, int k) {
        //Primero miramos cuanto consume por cada ciclo
        long total = 0;
        for(int num : chalk){
            total += num;
        }
        //Modularizamos el nivel de tiza que quedaría restante
        k %= total;
        //Y ahora con la tiza suficiente, buscamos el alumno en concreto
        for (int i = 0; i < chalk.length; i++) {
            if (chalk[i] > k) {
                return i;
            }
            k -= chalk[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        chalkReplace chalk  = new chalkReplace();
        int [] tizas = {5,1,5};
        System.out.println(chalk.chalkReplacer(tizas, 22));
    }

}

