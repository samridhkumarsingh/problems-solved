class Solution {
    public void com(int indx,int[] arr, int target ,List<Integer>ans,List<List<Integer>>rsl)
    {
            if(target==0) //
            {
                 rsl.add(new ArrayList<>(ans));
            return ;
            }
      for(int i=indx;i<arr.length;i++)
      {
        if(i>indx && arr[i]==arr[i-1])
        {
            continue;
        }
        if(arr[i]>target)
        {
            break;
        }
        ans.add(arr[i]);
        com(i+1,arr,target-arr[i],ans,rsl);
        ans.remove(ans.size()-1);
      }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>rsl= new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        Arrays.sort(candidates);
        com(0,candidates,target,ans,rsl);
        return rsl;
    }
}