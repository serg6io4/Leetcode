public class minBitFlipsConvertNumber {

    public int minBitFlips(int start, int goal) {
        //Hacemos la XOR
        int XOR = start ^ goal;
        int pasos = 0;
        while (XOR != 0) {
            pasos += XOR & 1; 
            XOR >>= 1;
        }
        return pasos;
    }

    public void main(String[] args) {
        minBitFlipsConvertNumber min = new minBitFlipsConvertNumber();
        System.out.println(min.minBitFlips(10, 7));
    }
}
