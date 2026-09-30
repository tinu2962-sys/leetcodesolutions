class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> fr=new ArrayList<>();
        fr.add(1);
        ans.add(fr);
        for(int i=1;i<numRows;i++){
            List<Integer>fs=new ArrayList<>();
            fs.add(1);
            for(int j=1;j<i;j++){
                int val=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                fs.add(val);
            }
            fs.add(1);
            ans.add(fs);
        }
        return ans;
    }
}