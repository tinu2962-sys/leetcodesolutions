class Solution {
    public int countGoodSubstrings(String s) {
        int n=s.length();
        int k=3;
        int count=0;
        for(int i=0;i<n-k+1;i++){
            char ch=s.charAt(i);
            if(ch!=s.charAt(i+1)&&ch!=s.charAt(i+2)&&s.charAt(i+1)!=s.charAt(i+2)){
                count++;
            }
        }
        return count;
    }
}