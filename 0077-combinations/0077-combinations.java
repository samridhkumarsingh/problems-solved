class Solution {
    public void com(int indx,int k,List<Integer>ans,List<List<Integer>>rsl,int[] arr)
    {
        if(ans.size()==k)
        {
            rsl.add(new ArrayList<>(ans));
            return;
        }
        if(indx>=arr.length) return;

        ans.add(arr[indx]);
        com(indx+1,k,ans,rsl,arr);
        ans.remove(ans.size()-1);
        com(indx+1,k,ans,rsl,arr);
    }
    public List<List<Integer>> combine(int n, int k) {
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        List<Integer>ans=new ArrayList<>();
        List<List<Integer>>rsl=new ArrayList<>();
        com(0,k,ans,rsl,arr);
        return rsl;
    }
}