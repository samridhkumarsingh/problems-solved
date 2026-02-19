class Solution {
    public int diagonalSum(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int sum=0;
        // for(int i=0;i<m;i++) //brute force
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(i==j)
        //         {
        //             sum+=mat[i][j];
        //         }
        //         if(i+j==m-1)
        //         {
        //             if(i!=j)
        //             {
        //                   sum+=mat[i][j];
        //             }
        //         }
        //     }
        // }

        for(int i=0;i<m;i++)//optial sol
        {
            sum+=(mat[i][i]+mat[i][n-1-i]);
        }

        //if odd 
        if(m%2==1)
        {
            sum-=(mat[n/2][n/2]);
        }
        return sum;
    }
}