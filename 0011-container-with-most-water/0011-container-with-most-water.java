class Solution {
    public int maxArea(int[] height) {
        int ar = 0;
        int curar;
        int i=0;
        int j=height.length-1;
        while(i<j)
        {
            curar = (j-i)*(Math.min(height[i],height[j]));
            ar = Math.max(ar,curar);
            if (height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return ar;
    }
}