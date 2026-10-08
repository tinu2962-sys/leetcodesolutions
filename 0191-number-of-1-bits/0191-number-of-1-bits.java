class Solution {
    public int hammingWeight(int n) {
        String str=Integer.toBinaryString(n);
        int count = str.length() - str.replace("1", "").length();
        return count;

    }
}