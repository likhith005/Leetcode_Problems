class Solution {
    public boolean isPowerOfFour(int n) {
     if (n <= 0) {
            return false;
        }
        
        // Check if n is a power of two
        if ((n & (n - 1)) != 0) {
            return false;
        }
        
        // Count the number of trailing zeroes
        int countZeros = 0;
        while (n > 1) {
            n >>= 1;
            countZeros++;
        }
        
        // Check if the number of trailing zeroes is even
        return (countZeros % 2 == 0);
    }
}