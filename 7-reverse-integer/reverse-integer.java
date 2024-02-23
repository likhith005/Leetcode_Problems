class Solution {
    public int reverse(int x) {
        int rem = 0;
        int rev = 0;
        while (x != 0) {
            rem = x % 10;
            x = x / 10;

            if(rev>0 && rev>(Integer.MAX_VALUE-rem)/10 || rev<0 && rev<(Integer.MIN_VALUE-rem)/10){
                return 0;
            }

            rev = rev * 10 + rem;
        }
        return rev;
    }
}