class Solution {
    public boolean isPalindrome(int x) {
        int m=x;
        int s=0;
        while(x>0){
            int r=x%10;
            s=s*10+r;
            x/=10;
        }
        if(s==m){
            return true;
        }else{
            return false;
        }
    }
}