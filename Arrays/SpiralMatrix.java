package Arrays;
import java.util.*;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int row = 0;
        int col = 0;
        int count = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        String currDir = "right";
        int[][] visited = new int[m][n];


        while(count<(m*n)){

            if(currDir.equals("right")){
                if(col<n && visited[row][col]!=1){
                    visited[row][col] = 1;
                    result.add(matrix[row][col]);
                    count ++;
                    col++;
                }


                else{
                    currDir = "down";
                    row++;
                    col--;
                }

            }

            else if(currDir.equals("down")){
                if(row<m && visited[row][col]!=1){
                    visited[row][col] = 1;
                    result.add(matrix[row][col]);
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
                    result.add(matrix[row][col]);
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
                    result.add(matrix[row][col]);
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

        return result;

    }

    public static void main(String args[]){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res = spiralOrder(arr);
        for(Integer x:res){
            System.out.print(x+" ");

        }

        String s="hello";
        System.out.println(s.substring(0,0));

    }

}
