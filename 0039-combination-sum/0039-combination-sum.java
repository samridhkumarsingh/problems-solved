class Solution {
    public void combinationSum(int indx,List<Integer>ans,List<List<Integer>>rsl,int[] candidates, int target) {
        if(indx==candidates.length)
        {
            if(target==0)
            {
                rsl.add(new ArrayList<>(ans));
            }
            return ;
        }
        if(candidates[indx]<=target)
        {
            ans.add(candidates[indx]);
            combinationSum(indx,ans,rsl,candidates,target-candidates[indx]);
            ans.remove(ans.size()-1);
        }
         combinationSum(indx+1,ans,rsl,candidates,target);
      
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>>rsl=new ArrayList<>();
        List<Integer>ans= new ArrayList<>();
        combinationSum(0,ans,rsl,candidates,target);
        return rsl;
    }
}