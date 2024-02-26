class Solution {
    public boolean isPowerOfFour(int n) {
        // if (n <= 0) {
        //     return false;
        // }
        // // Check if n is a power of two
        // if ((n & (n - 1)) != 0) {
        //     return false;
        // }
        // // Count the number of trailing zeroes
        // int countZeros = 0;
        // while (n > 1) {
        //     n >>= 1;
        //     countZeros++;
        // }
        // // Check if the number of trailing zeroes is even
        // return (countZeros % 2 == 0);



        // if(n<=0){
        //     return false;
        // }
        // while((n%4)==0){
        //     n /= 4;
        // }
        // return (n==1) ? true : false;



        // if(n<=0){
        //     return false;
        // }
        // int x = (int) (Math.log(n)/Math.log(4));
        // return Math.pow(4,x)==n; // return (Math.pow(4,x)==n) ? true: false;




        if(n<=0){
            return false;
        }

        return ((n&(n-1))==0 && ((n-1)%3)==0);
    }
}
    