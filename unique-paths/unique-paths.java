class Solution {
    // int result = 0;
    public int uniquePaths(int m, int n) {
        
        int[][] dp = new int[m][n];
        
        // for(int i = 0; i<m;i++){
        //     for(int j=0;j<n;j++){
        //         dp[i][j]=-1;
        //     }
        // }
        
        return helper(m-1,n-1,dp);
        
    }
    
    private int helper(int row, int col, int[][] dp){
        
        int [][] dirs = {{0,1}, {1,0}};
        //base
        
        if(row==0) return 1;
        if(col==0) return 1;
        
        
        
        if(dp[row][col] != 0) return dp[row][col];
        
        //logic
                int down = helper(row-1,col, dp);
                int right = helper(row,col-1, dp);
            
                dp[row][col] = right + down;
        
        return right+down;
    }
}