class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0; 
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] != 0) {
                nums[count] = nums[r];
                count++;
            }
        }
        
   
        while (count < nums.length) {
            nums[count] = 0;
            count++;
        }
    }
}
