package ArraysAndStrings;

import java.util.HashMap;

/************************************
* Majority Element 
* Author: @partha98
* Date: 07-01-2024
*************************************/

/********************************************************************************************************************************************************************************************************************
* Question
* Given an array nums of size n, return the majority element.
* The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
********************************************************************************************************************************************************************************************************************/


/*************************************
* Solution 
*************************************/

/**********************************************************************************************************************************************************************************************************************
* Approach
* Whenever, we need to deal with the number of cccurences of elements in a array we need to construct a frequency map. To construct the frequency map we will use a simple hashmap.
* After inserting an element into the map and updating the frequency we will check if that element meets the frequency criteria [more than (n/2)] and if true we return the value.
**********************************************************************************************************************************************************************************************************************/

class MajorityElement {
     public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freqMap = new HashMap<Integer,Integer>();
        int temp = 0;
        int majorCriteria = nums.length / 2;
        for(int num: nums){
            temp = freqMap.getOrDefault(num,0) + 1;
            freqMap.put(num,temp);
            if(temp > majorCriteria){
                return num;
            }
        }

        return temp;
    }
}

/*********************************************************
 * Complexity Analysis
 * 
 * Time Complexity O(n)
 * Space Conplexity O(n)
 * 
 *********************************************************/