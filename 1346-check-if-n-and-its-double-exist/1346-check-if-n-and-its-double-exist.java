class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            int res=2*arr[i];
            if(set.contains(res) ||(arr[i]%2==0 && set.contains(arr[i]/2)))
            {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}