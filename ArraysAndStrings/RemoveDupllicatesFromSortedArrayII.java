package ArraysAndStrings;

/******************************************
* Remove Duplicates from sorted array II
* Author: @partha98
*******************************************/

/********************************************************************************************************************************************************************************************************************
* Question
* Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
* Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
* More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
* Return k after placing the final result in the first k slots of nums.
* Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
********************************************************************************************************************************************************************************************************************/


/*************************************
* Solution 
*************************************/

/**********************************************************************************************************************************************************************************************************************
* Basically it is the same as the previous Remove duplicates from sorted Array problem with a minor twist. 
*
* Naive/Brute force Approach
* We start at the second index and check the element at (index - 2) and if its same we replace the element with Integer.MAX_INT. Once the array has been iterated through we sort the array again. 
* Time complexity: O(nlogn) and Space Complexity: O(1)
*
* Elegant Approach
* Create a variable count. Iterate through the array and keep copying elements back into the same array. The first two elements gets copied without any issue as it cant be duplicate. From the third element we check 
* if the current element is not equal to the (index - 2) element and save into the array and counter is incremented, if the elements are same then the current element is skiped. 
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