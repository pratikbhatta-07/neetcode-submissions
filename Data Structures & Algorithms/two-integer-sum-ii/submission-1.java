class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0, right = n - 1;
        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if(left < right && sum < target) left++;
            else if (left < right && sum > target) right--;
            else return new int[] {left + 1, right + 1};
        }
        return new int[] {};
    }
}
