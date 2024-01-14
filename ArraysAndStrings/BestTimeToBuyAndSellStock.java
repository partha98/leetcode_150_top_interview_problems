package ArraysAndStrings;

/************************************
* Best Time to Buy and Sell Stock 
* Author: @partha98
* Date: 14-01-2024
*************************************/

/********************************************************************************************************************************************************************************************************************
* Question
* You are given an array prices where prices[i] is the price of a given stock on the ith day.
* You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
* Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
********************************************************************************************************************************************************************************************************************/


/*************************************
* Solution 
*************************************/

/**********************************************************************************************************************************************************************************************************************
* Approach
*
* We will take a greedy approach here, bare in mind we can buy and sell once. So, only one transaction is allowed. So, we have a minPrice and maxPorfit variables. We iterate through the array and find the minPrice
* if minPrice is not updated for an iteration then we check if we maxProfit can be updated or not.
* After the end of the iteration maxProfit is the result.
**********************************************************************************************************************************************************************************************************************/


public class BestTimeToBuyAndSellStock {
    
    public int maxProfit(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(minPrice>prices[i]){
                minPrice = prices[i];
            }
            else if(maxProfit<prices[i]-minPrice){
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;

    }

}

/*********************************************************
 * Complexity Analysis
 * 
 * Time Complexity O(n)
 * Space Conplexity O(1)
 * 
 *********************************************************/