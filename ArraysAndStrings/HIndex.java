package ArraysAndStrings;

import java.util.Arrays;

/************************************
* Best Time to Buy and Sell Stock II
* Author: @partha98
* Date: 14-01-2024
*************************************/

/********************************************************************************************************************************************************************************************************************
* Question
* Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.
* According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.
********************************************************************************************************************************************************************************************************************/


/*************************************
* Solution 
*************************************/

/**********************************************************************************************************************************************************************************************************************
* Approach
*
* The approach here is to sort the array. Now traverse the array in reverse and compare it with the index if the index is more than the value then the previous element is the answer. We start from 1 and use n-idx
* to iterate the array. If arr[n-idx] < idx then thats the limit and idx-1 or the previous index was the answer.
**********************************************************************************************************************************************************************************************************************/

public class HIndex {
    
     public int hIndex(int[] citations) {
        int idx = 0;
        Arrays.sort(citations);
        int n = citations.length;
        for(idx=1;idx<=n;++idx){
            if(citations[n-idx]<idx){
                break;
            }
        }

        return idx-1;
    }

}

/*********************************************************
 * Complexity Analysis
 * 
 * Time Complexity O(n)
 * Space Conplexity O(1)
 * 
 *********************************************************/
