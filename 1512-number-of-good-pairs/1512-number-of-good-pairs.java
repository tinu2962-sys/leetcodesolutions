class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        int ans=0;
        for(int boom:hm.keySet()){
            int s=hm.get(boom);
            int m=s*(s-1)/2;
            ans+=m;
        }
        return ans;
    }
}