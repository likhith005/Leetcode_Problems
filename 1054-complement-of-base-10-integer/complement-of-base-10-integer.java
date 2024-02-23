class Solution {
    public int bitwiseComplement(int n) {
        int l = Integer.toBinaryString(n).length();
        int helper = (1 << l) - 1;
        return helper ^ n;
    }
}