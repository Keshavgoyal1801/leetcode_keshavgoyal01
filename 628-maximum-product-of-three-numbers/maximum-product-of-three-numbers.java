class Solution {
    public int maximumProduct(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                if(nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }

        int n = nums.length;
        int product1 = nums[n-1] * nums[n-2] * nums[n-3];
        int product2 = nums[0] * nums[1] * nums[n-1];
        int max_product = Math.max(product1,product2);
        return max_product;
    }
}