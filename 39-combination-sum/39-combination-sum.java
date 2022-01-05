class Solution {
    List<List<Integer>> result;
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        result = new ArrayList();
        helper(candidates, target, new ArrayList<>(), 0);
        return result;
    }
    
    private void helper(int[] candidates, int target, List<Integer> currList, int index){
        
        //base
        
        if(target == 0) result.add(new ArrayList<>(currList));
        
        if(target < 0 || index >= candidates.length) return;
        
        for(int i = index; i < candidates.length; i++){
            
            //action
            
            currList.add(candidates[i]);
            
            //recurse
            helper(candidates, target - candidates[i], currList, i);
            
            //backtrack
            currList.remove(currList.size() - 1);
            
            
        }
        
        
    }
}