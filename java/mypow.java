public class mypow {
    public double myPow(double x, int n) {
        if(n==0) return 1.0;
        long N = n;
        if(N < 0){
            x = 1/x;
            N = -N;
        }
        double resultado = 1;
        double productoActual = x;
        while(N>0){
            if(N % 2 != 0){
                resultado = resultado * productoActual;
            }
            productoActual = productoActual * productoActual;
            N = N/2;
        }
        return resultado;
    }

    public void main(String[] args) {
        mypow p = new mypow();
        System.out.println(p.myPow(2, -2));
    }
}
