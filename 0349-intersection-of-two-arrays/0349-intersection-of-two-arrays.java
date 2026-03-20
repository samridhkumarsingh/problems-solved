class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> Mp= new HashMap<>();
       ArrayList<Integer> arr= new ArrayList<>();
        int n=nums1.length;
        for(int i=0;i<n;i++)
        {
            Mp.put(nums1[i],i);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(Mp.containsKey(nums2[i])) 
            {
                if(!arr.contains(nums2[i]))
                {
                    arr.add(nums2[i]);
                }
            }
        }

     int[] result = new int[arr.size()];

        for(int i=0;i<arr.size();i++)
        {
            result[i] = arr.get(i);
        }

        return result;
    }
}