class Solution {
    public boolean isValid(char[][] board,int row, int col,char ch)
    {
        for(int i=0;i<board.length;i++)
        {
            if(board[row][i]==ch) return false;
            if(board[i][col]==ch) return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==ch) return false;
        }
        return true;
    }
    public boolean backtrack(char[][] board) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char c='1';c<='9';c++)
                    {
                        if(isValid(board,i,j,c))
                        {
                            board[i][j]=c;
                            if(backtrack(board)) return true;
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
           return true;
    }
 
    public void solveSudoku(char[][] board)
    {
        backtrack(board);
    }
}