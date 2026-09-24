class Solution {
    public int reverse(int x) {
        long s=0;
        int m=x;
        while(x!=0){
            int r=x%10;
            s=s*10+r;
            x/=10;
        }
        if(s>Integer.MAX_VALUE||s<Integer.MIN_VALUE){
            return 0;
        }
       return (int)s;
    }
}