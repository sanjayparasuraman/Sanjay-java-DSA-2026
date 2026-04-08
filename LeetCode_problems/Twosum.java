import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap <Integer , Integer> map  = new HashMap <>();
     for(int i=0;i<nums.length;i++){
        int needed = target - nums[i];
        if(map.containsKey(needed)){
            return new int[]{map.get(needed),i};
        }
        map.put(nums[i],i);
     }
     return new int[]{};
    } 
}     // leetcode Problem 1 two sum {2,7,11,15} target = 9
