public class minimumNumberSwaps {

    public int minSwaps(String s) {
        if(s.isEmpty()) return 0;
        int desBalanceado = 0;
        int swaps = 0;
        int i = 0;
        for(char t : s.toCharArray()){
            if(t == '['){
                desBalanceado += 1;
            }else{
                desBalanceado -= 1;
            }
            if(desBalanceado < 0){
                swaps++;
                desBalanceado +=2;
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        minimumNumberSwaps m = new minimumNumberSwaps();
        System.out.println(m.minSwaps("]]][[["));
    }
}
