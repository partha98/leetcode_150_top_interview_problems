package ArraysAndStrings;

/***************************************
* Remove Duplicates from sorted array
* Author: @partha98
****************************************/

/********************************************************************************************************************************************************************************************************************
* Question
* Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. 
* Then return the number of unique elements in nums.
* Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
* Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. 
* The remaining elements of nums are not important as well as the size of nums.
* Return k.
********************************************************************************************************************************************************************************************************************/


/*************************************
* Solution 
*************************************/

/**********************************************************************************************************************************************************************************************************************
* Naive/Brute force Approach
* We start at the second index and check the previous index if its same we replace the previous element with Integer.MAX_INT. Once the array has been iterated through we sort the array again. 
* Time complexity: O(nlogn) and Space Complexity: O(1)
*
* Elegant Approach
* Create a variable count. Iterate through the array and keep copying elements back into the same array. The first element gets copied without any issue as it cant be duplicate. From the second element we check if
* the current element is not equal to the previous element and save into the array and counter is incremented, if the elements are same then the current element is skiped. 
* The count in this case will not only be the answer but also serve as the index for the copying process.
**********************************************************************************************************************************************************************************************************************/

class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {

        if(nums.length == 0){
            return 0;
        }
 
        int count = 0;
        
        for(int i=0;i<nums.length;i++){
            if(i<1 || nums[i]!=nums[i-1])
            nums[count++] = nums[i];
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