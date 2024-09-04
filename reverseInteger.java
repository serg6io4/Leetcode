public class reverseInteger {
    public int reverse(int x) {
        long result= 0;
        while(x!=0){
            result = result * 10 + x % 10;
            x = x/10;
            if(result<Integer.MIN_VALUE || result> Integer.MAX_VALUE) return 0;
        }
        return (int)result;
    }
    public static void main(String[] args) {
        reverseInteger ri = new reverseInteger();

        System.out.println(ri.reverse(123));        // 321
        System.out.println(ri.reverse(120));        // 21
        System.out.println(ri.reverse(-123));       // -321
        System.out.println(ri.reverse(-120));       // -21
        System.out.println(ri.reverse(5));          // 5
        System.out.println(ri.reverse(-5));         // -5
        System.out.println(ri.reverse(1534236469)); // 0 (debido al desbordamiento)
        System.out.println(ri.reverse(0));          // 0
    }
}
