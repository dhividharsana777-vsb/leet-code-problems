class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] r = new int[m];
        int[] c = new int[n];
        for (int i = 0 ; i < indices.length; i++) {
            r[indices[i][0]]++;
            c[indices[i][1]]++;
        }
        int oddRows = 0;
        for(int i =0; i < m; i++) {
            if(r[i]%2 == 1) {
                oddRows++;
            }            
        }
        int oddColumns = 0;
        for(int i =0; i < n; i++){ 
            if(c[i]%2 == 1) {
                oddColumns++;
            }
        }
        return oddRows * n + oddColumns * m - 2*oddRows*oddColumns;
    }
}
