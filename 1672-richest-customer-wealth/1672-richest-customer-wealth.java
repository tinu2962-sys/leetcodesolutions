class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int rs=0;
            for(int j=0;j<accounts[i].length;j++){
                rs+=accounts[i][j];
            }
            if(rs>ans){
                ans=rs;
            }
        }
        return ans;
    }
}