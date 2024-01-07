package ArraysAndStrings;

/************************************
* Merge Sorted Array 
* Author: @partha98
*************************************/

/********************************************************************************************************************************************************************************************************************
* Question
* You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
* Merge nums1 and nums2 into a single array sorted in non-decreasing order.
* The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
* To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
********************************************************************************************************************************************************************************************************************/


/*************************************
* Solution 
*************************************/

/**********************************************************************************************************************************************************************************************************************
* Approach
* The concept involves simultaneously traversing both arrays, each with its dedicated counter.
* Once the primary iteration finishes, one of the arrays will be fully traversed. At this point, we iterate through the remaining array, filling the resulting array with its elements.
*
* There is another approach you can use a TreeMap. Iterate through both array store them in the treeMap and simply extract out the keys of the TreeMap. TreeMap sorts the keys. Time complexity will be O(n) and space
* complexity will be O(n) as well.
**********************************************************************************************************************************************************************************************************************/

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lim = (m>n) ? m : n; 
        int i = 0; //index for nums1
        int j = 0; //index for nums2
        int arr[] = new int[m+n];
        int count = 0;
        while(i<m && j<n){
            if(nums1[i] > nums2[j]){
                arr[count] = nums2[j];
                j++;
            }
            else{
                arr[count] = nums1[i];
                i++;
            }
            count++;
        }

        while(j<n){
            arr[count] = nums2[j];
            count++;
            j++;
        }
        
        while(i<m){
            arr[count] = nums1[i];
            count++;
            i++;
        }

        for(i=0;i<(m+n);i++){
            nums1[i] = arr[i];
        }
    }
}

/*********************************************************
 * Complexity Analysis
 * 
 * Time Complexity O(m+n)
 * Space Conplexity O(m_n)
 * 
 *********************************************************/