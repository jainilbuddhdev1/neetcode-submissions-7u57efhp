class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> currentSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!currentSet.add(nums[i]))
                return true;
        }
        return false;   
    }
}