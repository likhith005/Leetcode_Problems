class Solution {
    public boolean checkPowersOfThree(int n) {

        // for (int i = 15; i >= 0; i--) {
        // int x = (int) Math.pow(3, i);
        // if (x <= n) {
        // n -= x;
        // }
        // if (n == 0) {
        // return true;
        // }
        // }
        // return false;
        // }
        // }
        int x = (int) (Math.log(n) / Math.log(3));
        int maxPower = (int) Math.pow(3, x);

        return checkSumOfPowers(maxPower, n);
    }

    static boolean checkSumOfPowers(int maxPower, int n) {
        while (maxPower > 0) {
            if (n >= maxPower) {
                n -= maxPower;
                if (n == 0) {
                    return true;
                }
            }
            maxPower /= 3;
        }
        return false;
    }
}