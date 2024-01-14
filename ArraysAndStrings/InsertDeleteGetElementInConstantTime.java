package ArraysAndStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/************************************
* Jump Game
* Author: @partha98
* Date: 14-01-2024
*************************************/

/********************************************************************************************************************************************************************************************************************
* Question
* Implement the RandomizedSet class:
* RandomizedSet() Initializes the RandomizedSet object.
* bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
* bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
* int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
* You must implement the functions of the class such that each function works in average O(1) time complexity.
********************************************************************************************************************************************************************************************************************/


/*************************************
* Solution 
*************************************/

/**********************************************************************************************************************************************************************************************************************
* Approach
*
* Whenever, we need constant retrieval and insertion time the solution is HashMap. This problem can be fairly easily resolved by using an HashMap.
**********************************************************************************************************************************************************************************************************************/

public class InsertDeleteGetElementInConstantTime {
    
    HashMap<Integer,Boolean> valMap; 

    public InsertDeleteGetElementInConstantTime() {
        valMap = new HashMap<Integer,Boolean>();
    }
    
    public boolean insert(int val) {
        if(valMap.containsKey(val)){
            return false;
        }
        else{
            valMap.put(val,true);
        }
        return true;
    }
    
    public boolean remove(int val) {
        if(valMap.containsKey(val)){
            valMap.remove(val);
        }
        else{
            return false;
        }
        return true;
    }
    
    public int getRandom() {
        List<Integer> keyList = new ArrayList(valMap.keySet());
        Random random = new Random();
        return keyList.get(random.nextInt(keyList.size()));
    }

}

/*********************************************************
 * Complexity Analysis
 * 
 * Time Complexity O(1)
 * Space Conplexity O(n)
 * 
 *********************************************************/