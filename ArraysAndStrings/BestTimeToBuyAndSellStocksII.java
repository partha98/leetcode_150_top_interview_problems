package ArraysAndStrings;

/************************************
* Best Time to Buy and Sell Stock II
* Author: @partha98
* Date: 14-01-2024
*************************************/

/********************************************************************************************************************************************************************************************************************
* Question
* You are given an array prices where prices[i] is the price of a given stock on the ith day.
* On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
* Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
********************************************************************************************************************************************************************************************************************/


/*************************************
* Solution 
*************************************/

/**********************************************************************************************************************************************************************************************************************
* Approach
*
* We will take a greedy approach here, bare in mind we can buy and sell once. So, we can buy and sell multiple times throughout the array. 
* So, we have a minPrice , tempProfit and  totalProfit variables. We iterate through the array and find the minPrice. 
* Then we check tempProfit is increased, then we add to the totalProfit. And sell the stock so , we update minPrice to current price and reset tempProfit to 0.
* After the end of the iteration totalProfit is the result.
**********************************************************************************************************************************************************************************************************************/


public class BestTimeToBuyAndSellStocksII {
    
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int tempProfit = 0;
        int totalProfit = 0;

        for(int price: prices){
            System.out.println(price+" "+minPrice+" bomi");
            if(minPrice > price){
                minPrice = price;
            }
            if(tempProfit < price - minPrice){
                tempProfit = price - minPrice;
                totalProfit+=tempProfit;
                minPrice = price;
                tempProfit = 0;
            }
        }

        return totalProfit;
    }
    
}

/*********************************************************
 * Complexity Analysis
 * 
 * Time Complexity O(n)
 * Space Conplexity O(1)
 * 
 *********************************************************/