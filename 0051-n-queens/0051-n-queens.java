class Solution {
    public boolean isSafe(char[][] board,int row,int col,int n)
    {
        for(int j=0;j<n;j++)
        {
            if(board[row][j]=='Q') return false;
        }
         for(int i=0;i<n;i++)
        {
            if(board[i][col]=='Q') return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]=='Q') return false;
        }
         for(int i=row,j=col;i>=0 && j<n;i--,j++)
        {
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
    public void queens(List<List<String>> rsl,char[][] board,int row,int n)
    {
        if(row==n)
        {
            List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                temp.add(new String(board[i]));
            }
            rsl.add(temp);
            return ;
        }
        for(int j=0;j<n;j++)
        {
            if(isSafe(board,row,j,n))
            {
                board[row][j]='Q';
                queens(rsl,board,row+1,n);
                board[row][j]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> rsl=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(board[i],'.');
        }
        queens(rsl,board,0,n);
        return rsl;
    }
}