class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List <Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums1)
        {
           map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int j:nums2)
        {
            if(map.containsKey(j))
            {
                if(map.get(j)>0)
                {
                    list.add(j);
                     map.put(j, map.get(j)-1);
                }
            }
        }
        // int[] arr=list.toArray(new int[0]);
        // return arr;
        int[] arr = new int[list.size()];

for (int i = 0; i < list.size(); i++) {
    arr[i] = list.get(i);
}

return arr;
    }
}