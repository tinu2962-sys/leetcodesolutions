class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        int ans=0;
        int val=0;
        for(int boom:hm.keySet()){
             val=hm.get(boom);
            if(val>=2){
            return true;
            }
        }
        return false;
    }
}