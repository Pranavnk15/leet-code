// 

// Jump Game


// You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

// Return true if you can reach the last index, or false otherwise.

// 


class jumpGame {
    public boolean canJump(int[] nums) {
     int boundary = 0;
     for(int i =0;i<=boundary;i++) {
         boundary = Math.max(boundary,i+nums[i]);
         if(boundary >=nums.length-1)
         return true;
    } 
    return false;
    }
}

















// The above code is a Java implementation of a solution to the "Jump Game" problem. The problem statement is as follows:

// Given an array of non-negative integers `nums`, you are initially positioned at the first index. Each element in the array represents your maximum jump length at that position. Determine if you can reach the last index.

// The code uses a greedy approach to check if it's possible to jump from the first index to the last index. It iterates through the `nums` array, updating the `boundary` variable, which represents the farthest index that can be reached from the current index `i`. If the `boundary` ever becomes greater than or equal to the last index of the array (`nums.length - 1`), then it means we can reach the last index, and the function returns `true`. If the loop finishes without finding a valid path to the last index, it means we cannot reach it, and the function returns `false`.

// Now, let's go through the code step by step:

// 1. Initialize a variable `boundary` to 0. This variable will keep track of the farthest index that can be reached from the current index.

// 2. Start a loop that iterates through the `nums` array from index 0 to `boundary`.

// 3. Inside the loop, update the `boundary` by taking the maximum value between the current `boundary` and the sum of the current index `i` and the value at `nums[i]`. This means that the new `boundary` is either the old `boundary` or the position we can reach by jumping from the current index.

// 4. Check if the `boundary` is greater than or equal to the last index (`nums.length - 1`). If this condition is true, it means we can reach the last index from the current position. In that case, the function returns `true`.

// 5. If the loop finishes without returning `true`, it means we couldn't find a way to reach the last index. So, the function returns `false`.

// The code's time complexity is O(n), where n is the length of the `nums` array. This is because the loop iterates through the array once, and each iteration takes constant time. The space complexity is O(1) because the code only uses a constant amount of extra space regardless of the input size.