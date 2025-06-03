class Solution {
    public void moveZeroes(int[] nums) {
    int insert = 0;
    
    for(int num : nums){// Step 1: Move all non-zero elements to the front
        if(num != 0){
            nums[insert] = num;
            insert++;
        }
    }

        while(insert < nums.length){// Step 2: Fill the rest with 0s
            nums[insert] = 0;
            insert++;
        }
    }
}