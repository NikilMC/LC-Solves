class Solution {
    int row;
    int col;
    int[][] directions;
    int max=0; 
    public int findMaxFish(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};
        this.row=row;
        this.col=col;
        this.directions=directions;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    max=Math.max(max,dfs(grid,i,j));
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid, int r, int c){
        if(r<0 || r>=row || c<0 || c>=col){
            return 0;
        }
        if(grid[r][c]==0){
            return 0;
        }
        int count=grid[r][c];
        grid[r][c]=0;
        for(int i=0;i<directions.length;i++){
            count+=dfs(grid,r+directions[i][0],c+directions[i][1]);
        }
        return count;
    }
}