class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
    //   int i=0,j=n-1; //from right hand side.
    //     while(i<m && j>=0)
    //     {
    //         if(matrix[i][j]==target) return true;
    //        else if(matrix[i][j]<target)//go down
    //        {
    //         i++;
    //        }
    //        else if(matrix[i][j]>target)//go left
    //        {
    //        j--;
    //        }
    //     }
    //     return false;


    // from left down side
    int i=m-1,j=0;
    while(i>=0 && j<n)
    {
        if(matrix[i][j]==target) return true;
        else if(matrix[i][j]<target) j++;
        else if(matrix[i][j]>target) i--;
    }

    return false;
    }
}