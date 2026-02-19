class Solution {
    public int diagonalSum(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int sum=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum+=mat[i][j];
                }
                if(i+j==m-1)
                {
                    if(i!=j)
                    {
                          sum+=mat[i][j];
                    }
                }
            }
        }
        return sum;
    }
}