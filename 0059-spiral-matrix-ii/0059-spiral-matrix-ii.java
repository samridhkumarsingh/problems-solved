class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int minr=0,maxr=n-1;
        int minc=0,maxc=n-1;
        int num=1;
        while(minr<=maxr && minc<=maxc)
        {
            //left to right
            for(int j=minc;j<=maxc;j++){
                arr[minr][j]=num;
                num++;
            }
            minr++;
            //up to bottom
            if(minr>maxr || minc>maxc) break;
             for(int i=minr;i<=maxr;i++){
                arr[i][maxc]=num;
                num++;
            }
           maxc--;
            //right to left
             if(minr>maxr || minc>maxc) break;
             for(int j=maxc;j>=minc;j--){
                arr[maxr][j]=num;
                num++;
            }
            maxr--;
             //bottom to up
             if(minr>maxr || minc>maxc) break;
             for(int i=maxr;i>=minr;i--){
                arr[i][minc]=num;
                num++;
            }
            minc++;
        }
        return arr;
    }
}