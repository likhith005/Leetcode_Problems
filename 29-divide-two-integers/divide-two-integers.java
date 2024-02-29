class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) 
            return Integer.MAX_VALUE;

        boolean sign = (dividend >= 0) == (divisor >= 0);

        long dividendLong = Math.abs((long) dividend);
        long divisorLong = Math.abs((long) divisor);

        int result = 0;
        while (dividendLong - divisorLong >= 0) {
            int count = 0;
            while (dividendLong - (divisorLong << 1 << count) >= 0) {
                count++;
            }
            result += 1 << count;
            dividendLong -= divisorLong << count;
        }
        
        return sign ? result : -result;
    }
}