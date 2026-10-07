class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int l=0;
        int ans=0;
        int ct=0;
        int cf=0;
        int n=answerKey.length();
        for(int r=0;r<n;r++){
            char ch=answerKey.charAt(r);
            if(ch=='T'){
                ct++;
            }else{
                cf++;
            }
            while(Math.min(ct,cf)>k){
                if(answerKey.charAt(l)=='T'){
                    ct--;
                }else{
                    cf--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}