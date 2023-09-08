class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth=0;
        for(int i=0;i<accounts.length;i++){
            int temp = 0;
            for(int j=0;j<accounts[i].length;j++){
                temp += accounts[i][j];
            }
            maxwealth = Math.max(maxwealth,temp);
        }
        return maxwealth;
    }
}