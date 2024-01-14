package ArraysAndStrings;

/************************************
* Jump Game
* Author: @partha98
* Date: 14-01-2024
*************************************/

/********************************************************************************************************************************************************************************************************************
* Question
* You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
* Return true if you can reach the last index, or false otherwise.
********************************************************************************************************************************************************************************************************************/


/*************************************
* Solution 
*************************************/

/**********************************************************************************************************************************************************************************************************************
* Approach
*
* The approach is to track the maxReach which will be nums[i] + i.If at any point the maxReach is less than the index than we can't reach the end and we close it.
**********************************************************************************************************************************************************************************************************************/

public class JumpGame {
    
    public boolean canJump(int[] nums) {
        
        if(nums.length==1){
            return true;
        }
        if(nums.length==0){
            return true;
        }

        int maxReach = 0;
        int i = 0;

        while(i<nums.length){
            if(maxReach<(i+nums[i])){
                maxReach = i + nums[i];
            }
            i++;
            if(i>maxReach && i!=nums.length)
                return false;
        }
        
        return true;
    }

}

/*********************************************************
 * Complexity Analysis
 * 
 * Time Complexity O(n)
 * Space Conplexity O(1)
 * 
 *********************************************************/
