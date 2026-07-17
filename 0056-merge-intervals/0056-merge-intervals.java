 class Solution {//java
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>result=new ArrayList<>();
        int[] arrays=intervals[0];
        result.add(arrays);
        for(int[] in:intervals)
        {
            if(in[0]<=arrays[1]){
                arrays[1]=Math.max(arrays[1],in[1]);
            }
            else
            {
                arrays=in;//arrays phle hi result me store ho chuka hai to chnge kr skte hai 
                result.add(arrays);
            }
        }
       return result.toArray(new int[0][]);

    }
 }