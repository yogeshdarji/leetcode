package Arrays;

public class ContainerWithMostWater {
    public static int maxArea(int height[]) {
        int i = 0;
        int j = height.length - 1;

        int water = 0;

        while (i != j) {

            water = Math.max(water, (j - i) * Math.min(height[i], height[j]));

            if (height[i] < height[j])
                i++;
            else
                j--;
        }
            return water;

    }

    public static void main(String args[]){
        //int a[] = {4,1,1,3,6,2,1};
        int a[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));
    }
}
