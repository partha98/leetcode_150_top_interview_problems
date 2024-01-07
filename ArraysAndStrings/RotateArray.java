package ArraysAndStrings;

import java.util.HashMap;

/************************************
* Rotate Array
* Author: @partha98
* Date: 07-01-2024
*************************************/

/********************************************************************************************************************************************************************************************************************
* Question
* Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
********************************************************************************************************************************************************************************************************************/


/*************************************
* Solution 
*************************************/

/**********************************************************************************************************************************************************************************************************************
* Brute force / Naive Approach
* 
* Use two for loops , the outside for loop with iterate for k times.In the first loop store the last element in the first position and store the first position in a variable called shift.
* The inside for loop with iterate through the array and shift the elements to the next position. The Curr element goes to the temp variable and the shift variable is stored in the current index.
* Store the temp variable in the shift variable.
* Time complexity: O(n*n) and Space Complexity: O(1)
* 
* Elegant Approach
* First we find the effective value of k. [Required for scenarios when k is greated than size of the array]
* Once the effective value of k is calculated, we reverse the entire array.
* Then we reverse the array again but only till the first k elements.
* Finally, we reverse the array again but from k+1 index to last element.
**********************************************************************************************************************************************************************************************************************/

class RotateArray {
    public void rotate(int[] nums, int k) {
        
        //Finding total effective rotations requried
        k = k%nums.length;

        //Reversing entire array
        reverse(nums,0,nums.length-1);

        //reversing the begining which will become the rotated part
        reverse(nums,0,k-1);

        //reversing remaining section
        reverse(nums,k,nums.length-1);
    }

    public void reverse(int nums[],int start,int end){
        
        int temp = 0;
        while(end>start){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
            start++;
        }

    }
}

/*********************************************************
 * Complexity Analysis
 * 
 * Time Complexity O(n)
 * Space Conplexity O(1)
 * 
 *********************************************************/