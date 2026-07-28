class Solution {
    int row;
    int col;
    int[][] directions;
    public int countBattleships(char[][] board) {
        int row=board.length;
        int col=board[0].length;
        int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
        this.row=row;
        this.col=col;
        this.directions=directions;
        int count=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='X'){
                    count++;
                    dfs(board,i,j);
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid, int r, int c){
        if(r<0 || r>=row || c<0 || c>=col){
            return;
        }
        if(grid[r][c]=='.'){
            return;
        }
        grid[r][c]='.';
        for(int i=0;i<directions.length;i++){
            dfs(grid,r+directions[i][0],c+directions[i][1]);
        }
    }
}