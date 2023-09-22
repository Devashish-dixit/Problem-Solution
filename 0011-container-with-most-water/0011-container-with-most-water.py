class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        area = 0
        currentarea = 0
        i = 0
        j = len(height) -1
        while(i<j):
            currentarea = (j-i)*min(height[i],height[j])
            area = max(area,currentarea)
            if(height[i]<height[j]):
                i +=1
            else:
                j -=1
        return area