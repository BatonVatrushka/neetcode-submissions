class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentCount = 0;
        int maxCount = 0;
        for (int num : nums) {
            if (num == 1) {
                currentCount += 1; 
            }
            else {
                maxCount = Math.max(maxCount, currentCount);                               
                
                currentCount = 0;
            }
        } return Math.max(maxCount, currentCount);
    }
}