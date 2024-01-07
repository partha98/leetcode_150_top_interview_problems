package ArraysAndStrings;

/************************************
* Merge Sorted Array 
* Author: @partha98
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
* Approach
* The concept involves simultaneously traversing both arrays, each with its dedicated counter.
* Once the primary iteration finishes, one of the arrays will be fully traversed. At this point, we iterate through the remaining array, filling the resulting array with its elements.
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
 * Time Complexity O(m+n)
 * Space Conplexity O(m_n)
 * 
 *********************************************************/