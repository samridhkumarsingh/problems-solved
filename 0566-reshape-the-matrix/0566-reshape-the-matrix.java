class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] arr=new int[r][c];
        if(m*n==r*c)
        {
            int p=0,q=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(q==c)
                    {
                      p++;
                        q=0;
                        arr[p][q]=mat[i][j];
                        q++;
                      
                    }else
                    {
                    arr[p][q]=mat[i][j];
                    q++;
                    }
                }
            }
            return arr;
        }
        return mat;
    }
}