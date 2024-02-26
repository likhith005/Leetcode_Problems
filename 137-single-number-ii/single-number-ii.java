class Solution {
    public int singleNumber(int[] nums) {
        // int result = 0;
        // for(int k = 0; k <= 31; k++){
        //     int temp = (1<<k);
        //     int countOne = 0;

        //     for(int num : nums){
        //         if((num & temp) != 0){
        //         countOne++;
        //         }
        //     }

        //     if((countOne % 3) != 0){
        //         result |= temp;
        //     }
        // }
        // return result;

        int seenOnce = 0, seenTwice = 0;
        for (int num : nums) {
            seenOnce = (seenOnce ^ num) & (~seenTwice);
            seenTwice = (seenTwice ^ num) & (~seenOnce);
        }
        return seenOnce;
    }
}