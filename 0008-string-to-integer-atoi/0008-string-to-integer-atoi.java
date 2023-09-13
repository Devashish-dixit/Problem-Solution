class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i=0;
        double sum = 0;
        if(n == 0) return 0;

        while(i<n && s.charAt(i) == ' ')
        {
          i++;
        }

      boolean positive = false;
      boolean negative = false;

      if(i<n && s.charAt(i)=='+'){
        positive = true;
        i++;
      }

      if(i<n && s.charAt(i)=='-'){
        negative = true;
        i++;
      }

      while(i<n && s.charAt(i) >='0' && s.charAt(i) <= '9'){
        sum = sum*10 + (s.charAt(i) - '0');
        i++;
      }
      if(negative){
        sum = -sum;
      }

      if(positive && negative)return 0;

      int max = (int)Math.pow(2,31);
      int min = (int)Math.pow(-2,31);

      if(sum > max) return max;
      if(sum < min) return min;

      return (int)sum;
      
    }
}