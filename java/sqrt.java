public class sqrt {
    
    public int mySqrt(int x) {
        if (x == 0) return 0;
        double r = x / 2.0; 
        for (int i = 0; i < 20; i++) { 
            r = (r + x / r) / 2.0;
        }
        return (int) r;
    }
    
    public static void main(String[] args) {
        sqrt s = new sqrt();
        System.out.println(s.mySqrt(8));
    }
}
