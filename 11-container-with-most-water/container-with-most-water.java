class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while(left < right){
            int h;
            if(height[left] < height[right]){
                h = height[left];
            }
            else{
                h = height[right];
            }
            int width = right - left;
            int area = h*width;
            if(area > max){
                max = area;
            }
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}