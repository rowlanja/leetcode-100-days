class Solution {
    public int searchInsert(int[] nums, int target) {
        int lower = 0; 
        int upper = nums.length -1;
        int found = recurse(nums, target, lower, upper);
        System.out.println(String.format("returning %d", found));
        return found;
    }

    public int recurse(int[] nums, int target, int lower, int upper) {
        int mid = (lower+upper)/2;

        if(upper >= lower) {
            System.out.println(String.format("%d %d", nums[mid], mid));
            // define the base case
            if (nums[mid] == target) { 
                System.out.println(String.format("found %d", mid));
                return mid;
            }

            // define the recursive lower and upper cases
            if (nums[mid] < target) { return recurse(nums, target, mid + 1, upper); }
            if (nums[mid] > target) { return recurse(nums, target, lower,  mid - 1); }
        }
        return target > nums[mid] ? mid+1 : mid ;
    }
}
