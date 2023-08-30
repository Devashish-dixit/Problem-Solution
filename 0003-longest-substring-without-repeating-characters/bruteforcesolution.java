class Solution {
    Boolean check(String s,int i,int j)
    {
        Boolean[] visited = new Boolean[256];
        Arrays.fill(visited,false);
        for (int k=i;k<=j;k++)
        {
            if(visited[s.charAt(k)])
            {
                return false;
            }
            else
            {
                visited[s.charAt(k)] = true;
            }    
        }
        return true;
    }
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        for (int i=0;i<s.length();i++)
        {
            for(int j = i;j<s.length();j++)
            {
                if (check(s,i,j))
                {
                    length = Math.max(length,j-i+1);
                }
            }
        }
        return length;
    }
}