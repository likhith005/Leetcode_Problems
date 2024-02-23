class Solution {
    public boolean isPowerOfTwo(int n) {
        // long i=1;
        // while (i<n){
        //     i=i*2;
        // }

        // return i==n ? true:false;
        if(n<=0){
            return false;
        }
        return (n & (n-1)) == 0;
    }
}