class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int expected[] = new int[n];
        for(int i = 0; i < n; i++ ){
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        //array get sorted after using Arrays.sort(array_name);
        // for(int i = 0; i < n; i++){
        //     System.out.print(expected[i] + " ");
        // }

        int indices = 0;
        for(int i = 0; i < n; i++){
            if(heights[i] != expected[i]){
                indices++;
            }
        }
        
        return indices;
    }
}