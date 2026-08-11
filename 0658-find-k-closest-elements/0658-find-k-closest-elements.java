class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list=new ArrayList<>();
        int mid=Binary(arr,x);
        int p=mid,q=mid+1;
        while(k>0)
        { 
            if(p>=0 && q<arr.length)
            {
                    if(Math.abs(x-arr[p])<=Math.abs(x-arr[q]))
                {
                    list.add(arr[p]);
                    p--;
                    
                }
                else
                {
                    list.add(arr[q]);
                    q++;
                }
            }
            else if(p>=0)
            {
                list.add(arr[p]);
                p--;
              
            }
            else
            {
                list.add(arr[q]);
                q++;
               
            }
              k--;
        }
        Collections.sort(list);
        return list;
    }

    public int Binary(int[] arr,int x)
    {
         int le=0,rg=arr.length-1;
        while(le<=rg)
        {
            int mid=le+(rg-le)/2;
            if(arr[mid]==x) return mid;
            else if(arr[mid]>x) rg=mid-1;
            else le=mid+1; 
        }
        return rg;
    }
}