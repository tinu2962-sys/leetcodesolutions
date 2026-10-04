class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        if(n==0){
            return 0;
        }for(int i=0;i<=n-k;i++){
            min=Math.min(nums[i+k-1]-nums[i],min);
        }
        return min;
    }
}