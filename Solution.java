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
//Another solution
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] l = new int[n];
        int[] r = new int[n];
        for (int i=0; i<n; i++) {
            l[i] = nums[i];
            r[i] = nums[i+n];
        }
        int k=0; int m=0;
        for (int j=0; j<2*n; j++) {
            if (j%2==0) {
                nums[j] = l[k];
                k = k +1;
            } else {
                nums[j] = r[m];
                m = m+1;
            }
             
        }
        return nums;
    }
}
