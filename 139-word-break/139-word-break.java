class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        HashSet<String> set = new HashSet<>(wordDict);
        
        int[] dp = new int[s.length()];
        
        Arrays.fill(dp, -1);
        
        return helper(s, set, 0, dp);
        
    }
    
    private boolean helper(String s, HashSet<String> set, int index, int[] dp){
        
        if(index==s.length()) return true;
        
        if(dp[index]!=-1){
             if(dp[index]==1)return true;

             return false;
        }
        
        for(int i = index; i < s.length(); i++){
            
            String substr = s.substring(index, i+1);
            
            if(set.contains(substr)){
                
                boolean rem = helper(s, set, i+1, dp);
                
                if(rem==true){
                        dp[index]=1;
                        return true;
                    }
                
            }
            
        }
        
        dp[index] = 0;
        return false;
        
    }
}