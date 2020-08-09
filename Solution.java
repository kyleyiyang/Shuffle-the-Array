class Solution {
    public int[] shuffle(int[] nums, int n) {
        n = nums.length/2;
        int[] out = new int[2*n];
        for (int i=0;i<2*n;i++) {
            if (i%2 == 0) {
                out[i] = nums[i/2];
            } else {
                out[i] = nums[n + (i-1)/2];
            }
        }
        return out;
        
    }
}
