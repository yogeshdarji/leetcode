package Arrays;

public class SpiralMatrixII {

    public static int[][] generateMatrix(int n) {
        int res[][] = new int[n][n];

        int count = 0;
        int row = 0;
        int col = 0;
        int num = 1;
        String currDir = "right";
        boolean[][] visited = new boolean[n][n];
        int sum = 0;


        while(num<=n*n){

            if(currDir.equals("right")){
            if(col<n && !visited[row][col]){
                visited[row][col] = true;
                res[row][col] = num;
                num++;
                col++;
            }
            else{
                currDir = "down";
                col--;
                row++;
            }

            }

            else if(currDir.equals("down")){
            if(row<n && !visited[row][col]){
                visited[row][col] = true;
                res[row][col] = num;
                num++;
                row++;
            }
            else{
                currDir = "left";
                row--;
                col--;

            }


            }

            else if(currDir.equals("left")){
                if(col>=0 && !visited[row][col]){
                    visited[row][col] = true;
                    res[row][col] = num;
                    num++;
                    col--;
                }
                else{
                    currDir = "up";
                    row--;
                    col++;

                }
            }

            else {
                if(row>=0 && !visited[row][col]){
                    visited[row][col] = true;
                    res[row][col] = num;
                    num++;
                    row--;
                }
                else{
                    currDir = "right";
                    row++;
                    col++;

                }
            }



        } //end of while

        return res;
    }

    public static void main(String args[]){
        int[][] res = generateMatrix(3);
        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

}
