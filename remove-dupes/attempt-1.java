class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) { return 0; } // if no elements return 0

        int prevVal = nums[0];
        int prevValIdx = 0;
        int uniqueElements = 1;
        int copyElements = 0;
        int idx =  1;
        while(idx < nums.length) {
            int val = nums[idx];
            if(val == prevVal) {
                int idxCopy = idx;
                System.out.println(String.format("%d %d %d %d", prevVal, val, prevValIdx, idx));
                while(idxCopy+1 < nums.length) {
                    nums[idxCopy] = nums[idxCopy+1];
                    idxCopy++;
                }
                System.out.println(Arrays.toString(nums));
            } else {
                idx++;
                uniqueElements++;
            }
            prevVal = val;
            prevValIdx = idx;
        }
        return uniqueElements;
    }
}
