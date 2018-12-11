package DynamicProgramming;

public class NumberOfIslands {
    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int countNumberIslands = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    countNumberIslands++;
                    dfs(grid,i,j);
                }
            }
        }
        return countNumberIslands;
    }

    public static void dfs(char[][] grid, int i, int j){
        int m = grid.length;
        int n = grid[0].length;

        if(i<0 || j<0 || i>=m || j>=n || grid[i][j] =='0')
            return;

        grid[i][j] = '0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }

    public static void main(String args[]){
        char[][] grid = {{'1','1','1','1','0'}, {'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};

        System.out.println(numIslands(grid));
    }

}
