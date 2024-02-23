class Solution {
    public int bitwiseComplement(int n) {
        //int l = Integer.toBinaryString(n).length();
        int l = (int)(Math.log(n)/Math.log(2))+1;
        int helper = (1 << l) - 1;
        return helper ^ n;
    }
}