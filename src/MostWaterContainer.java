// 11. Container With Most Water
public class MostWaterContainer {

    public int maxArea(int[] height) {
        int maxArea = 0;
    /*
        for (int right = 1; right<height.length; right++){
            for (int left = 0; left<right; left++){
                maxArea = Math.max(maxArea, calculateArea(height[left],height[right], right-left));
            }
        }
    */

        int left = 0;
        int right = height.length-1;
        int currHeight;
        int prevHeight = 0;

        while (left<right){
            currHeight = Math.min(height[left],height[right]);
            if (currHeight >= prevHeight){
                maxArea = Math.max(maxArea, currHeight*(right-left));
            }
            if (height[left]<= height[right]){
                left ++;
            }
            else{
                right --;
            }
            prevHeight = currHeight;
        }
        return maxArea;

    }
}
