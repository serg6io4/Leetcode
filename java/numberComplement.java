public class numberComplement {

    public int findComplement(int num) {
        String resultado = Integer.toBinaryString(num);
        String aux = "";
        for( char x : resultado.toCharArray()){
            aux += (x=='0') ? "1" : "0";
        }
        return Integer.parseInt(aux, 2);
    }

    public static void main(String[] args) {
        numberComplement n = new numberComplement();
        System.out.println(n.findComplement(5));
    }
}
