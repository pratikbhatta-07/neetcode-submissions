class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int trapped = 0;

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = 0;
        suffix[n - 1] = 0;

        for(int i = 1; i < n; i++) {
            prefix[i] = Math.max(prefix[i - 1], height[i - 1]);
        }
        for(int j = n - 2; j>= 0; j--) {
            suffix[j] = Math.max(suffix[j + 1], height[j + 1]);
        }
        for(int i = 1; i < n; i++) {
            if(Math.min(prefix[i], suffix[i]) - height[i] > 0) {
                trapped += Math.min(prefix[i], suffix[i]) - height[i];
            }
        }
        return trapped;
    }
}
