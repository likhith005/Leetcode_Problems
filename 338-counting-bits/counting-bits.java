class Solution {
    public int[] countBits(int n) {
        // int[] result = new int[n + 1];
        // for (int i = 0; i < n + 1; i++) {
        //     int count = 0;
        //     int num = i;
        //     while (num != 0) {
        //         count += num & 1;
        //         num >>= 1;
        //     }
        //     result[i] = count;
        // }
        // return result;


        int[] result = new int [n+1];
        if(n==0){
            return result;
        }
        result[0] = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                result[i] = result[i/2]+1;
            }else{
                result[i] = result[i/2];
            }
        }
        return result; 
    }
}