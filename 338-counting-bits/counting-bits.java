class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            int count = 0;
            int num = i;
            while (num != 0) {
                count += num & 1;
                num >>= 1;
            }
            result[i] = count;
        }
        return result;
    }
}