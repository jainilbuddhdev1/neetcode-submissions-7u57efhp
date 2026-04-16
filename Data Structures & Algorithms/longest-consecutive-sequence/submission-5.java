class Solution {
    public int longestConsecutive(int[] nums) {
        int maxsize = 0;
        int i = 0;
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        Arrays.sort(nums);
        while (i + 1 <= nums.length) {
            int size = 0;
            while (i + 1 < nums.length) {
                if (nums[i] + 1 == nums[i + 1]){
                    size++;
                    i = i + 1;
                } else if (nums[i] == nums[i + 1]) {
                    i = i + 1;
                } else {
                    break;
                }
            }
            if (size >= maxsize) {
                maxsize = size + 1;
            }
            i = i + 1;
        }

        return maxsize;
    }
}
