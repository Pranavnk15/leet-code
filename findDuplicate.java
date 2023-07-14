<<<<<<< HEAD
//Find the Duplicate Number

class findDuplicate {
    public int findDuplicate(int[] nums) {
        int count[] = new int[nums.length];

        for(int i = 0;i<nums.length; i++) {
            count[nums[i]] ++;
            if(count[nums[i]] > 1) {
                return nums[i];
            }
        }
        return nums.length;

        
    }
=======
//Find the Duplicate Number

class findDuplicate {
    public int findDuplicate(int[] nums) {
        int count[] = new int[nums.length];

        for(int i = 0;i<nums.length; i++) {
            count[nums[i]] ++;
            if(count[nums[i]] > 1) {
                return nums[i];
            }
        }
        return nums.length;

        
    }
>>>>>>> 653ad8c (second cmmit)
}