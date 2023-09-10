class Solution {
    public String intToRoman(int num) {
        String ones[] = new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[] = new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hundreds[] = new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String thous[]=new String[]{"","M","MM","MMM"};
        
        String ans = thous[num/1000] + hundreds[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];

        return ans;
    }
}