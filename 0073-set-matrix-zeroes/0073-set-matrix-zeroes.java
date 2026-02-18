class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        
        // //method 1 //brute force
        // int[][] helper =new int[m][n];
        // for(int i=0;i<m;i++)
        // {for(int j=0;j<n;j++)
        // {
        //     helper[i][j]=matrix[i][j];
        // }}
        // for(int i=0;i<m;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(helper[i][j]==0)
        //         {
        //             //for row
        //             for(int k=0;k<n;k++)
        //             {
        //                 matrix[i][k]=0;
        //             }

        //             //for colom
        //             for(int p=0;p<m;p++)
        //             {
        //                 matrix[p][j]=0;
        //             }
        //         }
        //     }
        // }
        

        //method 2
        boolean[] row=new boolean[m];
        boolean[] colomn=new boolean[n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=true;
                    colomn[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            if(row[i]==true)
            {
                for(int a=0;a<n;a++)
                {
                    matrix[i][a]=0;
                }
            }
        }
           for(int j=0;j<n;j++)
        {
            if(colomn[j]==true)
            {
                for(int b=0;b<m;b++)
                {
                    matrix[b][j]=0;
                }
            }
        }
    }
}