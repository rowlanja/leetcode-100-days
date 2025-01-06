class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) { return 0; } // if no elements return 0

        int tracker = nums[nums.length-1];
        Stack<Integer> unique = new Stack<>();
        unique.push(tracker);
        for(int i = nums.length - 2; i >= 0; i--) {
           if(nums[i] == tracker) {
                continue;
           } else { 
                tracker = nums[i];
                unique.push(nums[i]);
           }
        }

        int idx = 0;
        while (!unique.isEmpty()) {
            nums[idx] = unique.pop();
            idx++;
        }
        return idx;
    }
}
