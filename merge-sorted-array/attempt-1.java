class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length == 0) { return; }

        int[] cache = new int[nums1.length];
        int counterNums1 = 0;
        int counterNums2 = 0;
        for(int idx = 0; idx < nums1.length; idx += 1){
                if(m == counterNums1 || m == 0) { // handle if all 1's are used
                    System.out.println("fill with num 2's");
                    while(counterNums2 < n) {
                        cache[idx] = nums2[counterNums2];
                        counterNums2++;
                        idx++;
                    }
                    break;
                } 
                if(n == counterNums2 || n == 0) { // handle if all 2's are used
                    System.out.println("fill with num 1's");
                    while(counterNums1 < m) {
                        cache[idx] = nums1[counterNums1];
                        counterNums1++;
                        idx++;
                    }
                    break;
                } 
                if( nums1[counterNums1] != 0 && nums1[counterNums1] < nums2[counterNums2]) {
                    cache[idx] = nums1[counterNums1];
                    counterNums1++;
                    System.out.println("num 1");
                } else {
                    cache[idx] = nums2[counterNums2];
                    counterNums2++;
                    System.out.println("num 2");
                }
        }
        for(int i = 0; i < nums1.length; i++){
            nums1[i] = cache[i];
        }
    }
}
