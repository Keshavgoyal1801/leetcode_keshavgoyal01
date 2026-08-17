class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        // person = row, acccount = col
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }
            // now we have sum of accounts of person
            // check for overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}