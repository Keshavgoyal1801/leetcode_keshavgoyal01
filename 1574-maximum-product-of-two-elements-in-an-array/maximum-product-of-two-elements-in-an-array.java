class Solution {
    public int maxProduct(int[] nums) {
        //int[] array = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                } 
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        return ((nums[nums.length-1] - 1) * (nums[nums.length-2]-1));
    }
}