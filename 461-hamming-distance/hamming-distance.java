class Solution {
    public int hammingDistance(int x, int y) {
        //return Integer.bitCount(x^y);

        // int xorResult = x^y;
        // int count=0;
        // while(xorResult != 0){
        //     xorResult &= (xorResult-1);
        //     count++; 
        // }
        // return count;

        int xorResult = x^y;
        int count = 0;
        while(xorResult != 0){
            count += xorResult & 1;
            xorResult >>= 1;
        }
        return count;
    }
}