class Solution {
    
    int[][] dirs = {{0,1}, {0,-1}, {1,0}, {-1,0}};
    
    public boolean exist(char[][] board, String word) {
        
        for(int i = 0; i < board.length; i++){
            
            for(int j = 0; j < board[0].length; j++){
                
                if(helper(board, word, i, j, 0)) return true;
                
            }
        }
        return false;
    }
    
    private boolean helper(char[][] board, String word, int i, int j, int index){
        
        //base
        
        if(index == word.length()) return true;
        
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j] == '#') return false;
        
        
        
        //logic
        if(board[i][j] == word.charAt(index)){
            
            char c = word.charAt(index);
            
            board[i][j] = '#';
            
            for(int[] dir : dirs){
                
                int nr = i + dir[0];
                int nc = j + dir[1];
                
                if(helper(board, word, nr, nc, index + 1)) return true;
                
            }
            
            board[i][j] = c;
        }
        return false;
    }
}