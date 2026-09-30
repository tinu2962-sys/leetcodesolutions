class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        for(int num:nums1){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }for(int num:nums2){
            if(hm.containsKey(num)&&hm.get(num)>0){
                res.add(num);
                hm.put(num,hm.get(num)-1);
            }
        }
        int ans[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}