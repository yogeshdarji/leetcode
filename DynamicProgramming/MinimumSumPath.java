package DynamicProgramming;

import java.util.Arrays;

public class MinimumSumPath {
    static int sum = 0;

    static int minCost = Integer.MAX_VALUE;
    public static int minPath(int grid[][]){
        int m = grid.length;
        int n = grid[0].length;
        boolean visited[][] = new boolean[m][n];
        int neighborsmat[][] = new int[m][n];
        for(int[] row:neighborsmat){
            Arrays.fill(row,-1);
        }
        return dfs(grid,0,0, visited, neighborsmat);
    }

    public static int dfs(int grid[][], int i, int j, boolean visited[][], int neighborsmat[][]){
        visited[i][j] = true;
        sum = sum + grid[i][j];
        if(i == grid.length-1 && j == grid[0].length-1) {
            minCost = Math.min(minCost,sum);
            sum = 0;
        }

        int[][] u = getNeighbours(grid,i,j,grid.length,grid[0].length, neighborsmat);

        for(int x=0; x<u.length; x++){
            for(int y=0; y<u[0].length;y++){
                if(u[x][y]!=-1 && !visited[x][y])
                    dfs(grid,x,y,visited, neighborsmat);
            }
        }

        return minCost;
    }

    public static int[][] getNeighbours(int grid[][], int row, int col, int m, int n, int[][] neighborsmat){
            if(col<n-1)
                neighborsmat[row][col+1] = grid[row][col+1];
            if(row<m-1)
                neighborsmat[row+1][col] = grid[row+1][col];

            return neighborsmat;
    }

    public static void main(String args[]){

        int grid[][] = {{1,3,1},{1,5,1},{4,2,1}};

        int res = minPath(grid);
        System.out.println(res);
    }

}
