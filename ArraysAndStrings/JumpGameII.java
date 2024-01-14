package ArraysAndStrings;

/************************************
* Jump Game II
* Author: @partha98
* Date: 14-01-2024
*************************************/

/********************************************************************************************************************************************************************************************************************
* Question
* You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
* Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
* 0 <= j <= nums[i] and
* i + j < n
* Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
* It is guranteed to reach n-1 index.
********************************************************************************************************************************************************************************************************************/


/*************************************
* Solution 
*************************************/

/**********************************************************************************************************************************************************************************************************************
* Approach
*
* The approach is simple we maintain a currEnd and a maxReach. The min number of jumps is stored in minJump.
* We iterate through the array and find the maxReach and if the index goes beyond currEnd or currReach means we need to jump so we increment the minJump and update currEnd to maxReach
**********************************************************************************************************************************************************************************************************************/

public class JumpGameII {
    public int jump(int[] nums) {

        int maxReach = 0;
        int minJump = 0;
        int currEnd = 0;

        for(int i=0;i<nums.length-1;i++){
            maxReach = Math.max(maxReach,nums[i]+i);
            
            if(i==currEnd){
                minJump++;
                currEnd = maxReach;
            }
        }

        return minJump;
    }
}


/*********************************************************
 * Complexity Analysis
 * 
 * Time Complexity O(n)
 * Space Conplexity O(1)
 * 
 *********************************************************/