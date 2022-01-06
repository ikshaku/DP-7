class Solution {
    List<List<String>> result;
    
    public List<List<String>> partition(String s) {
        
        result = new ArrayList<>();
        helper(s, 0, new ArrayList<>());
        return result;
    }
    
    private void helper(String s, int index, List<String> path){
        
        if(index == s.length()) result.add(new ArrayList<>(path));
        
        for(int i = index; i < s.length(); i++){
            
            String currString = s.substring(index, i+1);
            
            if(isPalindrome(currString)){
                
                path.add(currString);
                helper(s, i+1, path);
                path.remove(path.size() - 1);
            }
            
        }
        
    }
    
    private boolean isPalindrome(String s){
        
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right){
            
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
            
        }
        return true;
    }
    
}