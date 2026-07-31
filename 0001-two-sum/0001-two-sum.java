// I would use a HashMap because it gives O(n) time and directly stores complements while preserving indices. Two pointers requires sorting, which increases time complexity and complicates index tracking.


import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer ,Integer > map = new HashMap<>();
        for(int i = 0 ; i < nums.length ;i++){
            int numberneeded = target - nums[i];
            if(map.containsKey(numberneeded)){
                return new int[]{map.get(numberneeded),i};
            }

           // without the bellow line  Map stays empty ,containsKey() will always fail,if it found key only it can abel to return above statement kno ?return new int[]{map.get(numberneeded),i}; 
            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // incase if you dont fine 2 sum for target return it 
    }  
}