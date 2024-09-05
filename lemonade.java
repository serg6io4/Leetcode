

class lemonade {

    public boolean lemonadeChange(int[] bills) {
        int [] cajero = new int[3];
        for (int i = 0; i < bills.length; i++) {
            if(bills[i] == 5){
                cajero[0] += 1;
            }else if(bills[i] == 10){
                if(cajero[0]>=1){
                    cajero[0] -= 1;
                    cajero[1] += 1;
                }else{
                    return false;
                }
            }else{
                if(cajero[1] >= 1 && cajero[0]>= 1){
                    cajero[0] -= 1;
                    cajero[1] -= 1;
                    cajero[2] += 1;
                }else if(cajero[0]>=3){
                    cajero[0] -= 3;
                    cajero[2] += 1;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        lemonade solution = new lemonade();

        // Caso de prueba 1: Devolver true
        int[] bills2 = {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5};
        System.out.println(solution.lemonadeChange(bills2)); // false
    }
}


