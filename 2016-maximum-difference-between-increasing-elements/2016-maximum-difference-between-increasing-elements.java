class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int ans=0;
        int low=nums[0];
        for(int i=0;i<n;i++){
            int temp=nums[i]-low;
            ans=Math.max(ans,temp);
            low=Math.min(low,nums[i]);
        }
        if(ans==0){
            return -1;
        }else{
            return ans;
        }
    }
}