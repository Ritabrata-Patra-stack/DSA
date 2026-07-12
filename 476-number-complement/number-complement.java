class Solution {
    public int findComplement(int num) {
        int mask = Integer.toBinaryString(num).length();
        return ((1 << mask) - 1) ^ num;
    }
}