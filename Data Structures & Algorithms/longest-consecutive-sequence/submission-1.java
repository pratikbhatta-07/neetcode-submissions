class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }
        int max = 0;
        for(int n : set) {
            int count = 1, num = n;
            if(!set.contains(n - 1)){
                while(set.contains(num + 1)){
                    count++;
                    num++;
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }
}
