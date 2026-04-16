class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> rsl=new ArrayList<>(k);
        int lo=0,hi=arr.length -1;
        int lb=arr.length;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=x)
            {
                lb=Math.min(lb,mid);
                hi=mid-1;
            }
            else
            {
                lo=mid+1;
            }
        }
        
       int p=lb-1;
       int q=lb;
        while(k-1>=0)
        {
            if(p>=0&&q<arr.length)
            {
                 if (Math.abs(arr[p] - x) <= Math.abs(arr[q] - x))
                 {
                    rsl.add(arr[p]);
                     p--;
                
                  }
                  else  
                  {
                   rsl.add(arr[q]);
                     q++;
              
                  }
            }
            else if(p>=0)
            {
                rsl.add(arr[p]);
                p--;
               
            }
            else 
            {
                rsl.add(arr[q]);
                q++;
               
            }
            k--;
        }

    Collections.sort(rsl);
    return rsl;
    }
}