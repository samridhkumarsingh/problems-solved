class Solution {
    public void setZeroes(int[][] matrix) {
        //method 1 //brute force
        int m=matrix.length,n=matrix[0].length;
        int[][] helper =new int[m][n];
        for(int i=0;i<m;i++)
        {for(int j=0;j<n;j++)
        {
            helper[i][j]=matrix[i][j];
        }}
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(helper[i][j]==0)
                {
                    //for row
                    for(int k=0;k<n;k++)
                    {
                        matrix[i][k]=0;
                    }

                    //for colom
                    for(int p=0;p<m;p++)
                    {
                        matrix[p][j]=0;
                    }
                }
            }
        }
        
    }
}