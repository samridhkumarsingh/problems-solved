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
        

        // //method 2
        // boolean[] row=new boolean[m];
        // boolean[] colomn=new boolean[n];
        // for(int i=0;i<m;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(matrix[i][j]==0)
        //         {
        //             row[i]=true;
        //             colomn[j]=true;
        //         }
        //     }
        // }
        // for(int i=0;i<m;i++)
        // {
        //     if(row[i]==true)
        //     {
        //         for(int a=0;a<n;a++)
        //         {
        //             matrix[i][a]=0;
        //         }
        //     }
        // }
        //    for(int j=0;j<n;j++)
        // {
        //     if(colomn[j]==true)
        //     {
        //         for(int b=0;b<m;b++)
        //         {
        //             matrix[b][j]=0;
        //         }
        //     }
        // }

        // method3
        boolean ZeroRow=false;
        boolean ZeroCol=false;

        //check the zero row
        for(int j=0;j<n;j++)
        {
            if(matrix[0][j]==0)
            {
                ZeroRow=true;
                break;
            }
        }

          //check the zero colomn
        for(int i=0;i<m;i++)
        {
            if(matrix[i][0]==0)
            {
                ZeroCol=true;
                break;
            }
        }

        //checking the matrix without zero row and colomn
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        //if zero convating the rows and colomn zero

        //for row
        for(int j=1;j<n;j++)
        {
            if(matrix[0][j]==0)
            {
                for(int i=1;i<m;i++)
                {
                    matrix[i][j]=0;
                }
            }
        }

         //for colomn
        for(int i=1;i<m;i++)
        {
            if(matrix[i][0]==0)
            {
                for(int j=1;j<n;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }

        //travling zero rows and colomn
        if(ZeroRow==true)
        {
            for(int j=0;j<n;j++)
            {
                matrix[0][j]=0;
            }
        }
        if(ZeroCol==true)
        {
            for(int i=0;i<m;i++)
            {
                matrix[i][0]=0;
            }
        }

    }
}