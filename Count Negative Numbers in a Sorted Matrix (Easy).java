class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0, i = grid.length - 1, j = 0, n = grid[0].length;
        while(i >= 0 && j < n) {
            if(grid[i][j] >= 0) {
                j++;
            } else {
                count += n - j;
                i--; 
            }
        }
        return count;
    }
}
