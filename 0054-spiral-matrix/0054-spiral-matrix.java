class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>retn =new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int minr=0,maxr=m-1;
        int minc=0,maxc=n-1;
        while((minr<=maxr)&&(minc<=maxc))
        {
            //left to right
            for(int j=minc;j<=maxc;j++)
            {retn.add(matrix[minr][j]);
            }
            minr++;
            //top to bottom
           if((minr>maxr) || (minc>maxc)) break;
            for(int i=minr;i<=maxr;i++)
            {
                retn.add(matrix[i][maxc]);
            }
            maxc--;
            //rigth to left
            if((minr>maxr )|| (minc>maxc)) break;
            for(int j=maxc;j>=minc;j--)
            {
                retn.add(matrix[maxr][j]);
            }
            maxr--;
            //bottom to top
            if((minr>maxr) || (minc>maxc)) break;
            for(int i=maxr;i>=minr;i--)
            {
               retn.add(matrix[i][minc]);
            }
           minc++;
        }
         return retn;
    }
}