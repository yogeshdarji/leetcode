package Arrays;

public class SpiralMatrixIII {

    public static int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int row = r0;
        int col = c0;
        int count = 0;
        String currDir = "right";
        int[][] visited = new int[R][C];
        int res[][] = new int[R][C];
        int num = 1;
        int[][] finalRes = new int[R*C][2];
        int i = 0; int j = 0;

        while(count<R*C){

            if(currDir.equals("right")){
                if(col<C+1 && visited[row][col]!=1){
                    visited[row][col] = 1;
                    res[row][col] = num;
                    finalRes[i][j] = row;
                    finalRes[i][j+1] = col;
                    i++;
                    //j = 0;
                    num++;
                    count++;
                    col++;
                }


                else{
                    currDir = "down";
                    row++;
                    col--;
                }

            }

            else if(currDir.equals("down")){
                if(row<R+1 && visited[row][col]!=1){
                    visited[row][col] = 1;
                    res[row][col] = num;
                    finalRes[i][j] = row;
                    finalRes[i][j+1] = col;
                    i++;
                    i = 0;
                    count ++;
                    row++;
                }


                else{
                    currDir = "left";
                    col--;
                    row--;
                }

            }


            else if(currDir.equals("left")){
                if(col>=0 && visited[row][col]!=1){
                    visited[row][col] = 1;
                    res[row][col] = num;
                    finalRes[i][j] = row;
                    finalRes[i][j+1] = col;
                    i++;
                    i = 0;
                    count ++;
                    col--;
                }


                else{
                    currDir = "up";
                    row--;
                    col++;
                }

            }


            else if(currDir.equals("up")){
                if(row>=0 && visited[row][col]!=1){
                    visited[row][col] = 1;
                    res[row][col] = num;
                    finalRes[i][j] = row;
                    finalRes[i][j+1] = col;
                    i++;
                    i = 0;
                    count ++;
                    row--;
                }

                else{
                    currDir = "right";
                    col++;
                    row++;
                }

            }

        }


        return res;
    }


    public static void main(String args[]){

        int res[][] = spiralMatrixIII(5,6,1,4);
        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }


}
