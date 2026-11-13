class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int max = 0;
        for (int num : nums) {
            cnt = (num == 1) ? cnt + 1 : 0;
            max = Math.max(max, cnt);
        }
        return max;
    }
}