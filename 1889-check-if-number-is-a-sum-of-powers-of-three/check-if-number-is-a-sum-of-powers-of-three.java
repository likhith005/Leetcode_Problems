class Solution {
    public boolean checkPowersOfThree(int n) {
        int x = (int) (Math.log(n) / Math.log(3));
        int maxPower = (int) Math.pow(3, x);

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