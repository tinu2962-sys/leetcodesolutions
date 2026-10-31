class Solution {
    public int countNegatives(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int row=0;
        int col=c-1;
        int count=0;
        while(row<r&&col>=0){
            if(grid[row][col]<0){
                count+=(r-row);
                col--;
            }else{
                row++;
            }
        }
        return count;
    }
}