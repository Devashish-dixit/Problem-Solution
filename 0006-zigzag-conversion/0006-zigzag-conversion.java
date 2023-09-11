class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] sbs = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
        {
            sbs[i] = new StringBuilder();
        }

        char[] arr =s.toCharArray();
        int n = arr.length;
        int index = 0;

        while(n>index)
        {
            for(int j=0;j<numRows && index < n;j++)
            {
                sbs[j].append(arr[index++]);
            }
            for(int j=numRows-2 ;j>0 && index < n;j--)
            {
                sbs[j].append(arr[index++]);
            }
        }
        StringBuilder res = sbs[0];
        for(int k=1;k<sbs.length;k++)
        {
            res.append(sbs[k].toString());
        }
        return res.toString();
    }
}