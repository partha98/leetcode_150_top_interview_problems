package ArraysAndStrings;

/************************************
* Remove Element 
* Author: @partha98
* Date: 07-01-2024
*************************************/

/********************************************************************************************************************************************************************************************************************
* Question
* Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
* Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
* Change the array nums such that the first k elements of nums contain the elements which are not equal to val.The remaining elements of nums are not important as well as the size of nums.
* Return k.
********************************************************************************************************************************************************************************************************************/


/*************************************
* Solution 
*************************************/

/**********************************************************************************************************************************************************************************************************************
* Naive/Brute force Approach
* The problem is fairly straight forward. The brute force solution will be to create a new list and copy elements from nums into the new array and skip the element equal to val. The size of the list will be the 
* answer. Time complexity would be O(n) and space complexity will be O(n). It can be optimized and solved in O(1) space complexity.
*
* Elegant Approach
* Create a variable count. Iterate through the array and keep copying elements back into the same array but skip the elements which are equal to val. The count in this case will not only be the answer but also serve
* as the index for the copying process.
**********************************************************************************************************************************************************************************************************************/

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        
        int count = 0;

        if(nums.length==0){
            return count;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count] = nums[i];
                count++;
            }
        }
               
        return count;
    }
}

/*********************************************************
 * Complexity Analysis
 * 
 * Time Complexity O(n)
 * Space Conplexity O(1)
 * 
 *********************************************************/