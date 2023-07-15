// Subarray Sums Divisible by K



// Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

// A subarray is a contiguous part of an array.




class subArraySumDivByK {
    public int subarraysDivByK(int[] nums, int k) {
      int count = 0;
        int sum = 0;
        int[] remainderCount = new int[k];
        remainderCount[0] = 1;  // Initialize with 1 to count the subarrays starting at index 0
        
        for (int i = 0; i < nums.length; i++) {
            sum = (sum + nums[i]) % k;
            if (sum < 0) {
                sum += k;  // Ensure positive remainder
            }
            count += remainderCount[sum];
            remainderCount[sum]++;
        }
        
        return count;
    }
}