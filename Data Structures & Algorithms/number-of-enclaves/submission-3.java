class Solution {
    public static int count =0; 
    public int numEnclaves(int[][] grid) {
         int counte=0;
        for(int i=0;i<grid.length;i++)
        for(int j=0;j<grid[i].length;j++){
            if(grid[i][j]==1){
                int[]ar = new int[1];
                dfs(i,j,ar,grid);
                if(ar[0]==0){
                    counte+=count;
                }
                count=0;
            }
        }
       
       
        return counte;
    }
    public void dfs(int i, int j, int[]ar,int[][]grid){
        if(i<0 || i>=grid.length || j<0||j>=grid[i].length){
            ar[0]++;
            return;
        }
        if(grid[i][j]==0 || grid[i][j]==-1){
            return;
        }
        if(grid[i][j]==1){
            grid[i][j]=-1;
            count++;
        }
        dfs(i+1,j,ar,grid);
           dfs(i-1,j,ar,grid);
              dfs(i,j+1,ar,grid);
                 dfs(i,j-1,ar,grid);

    }
}