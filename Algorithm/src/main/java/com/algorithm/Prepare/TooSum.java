public class Solution {
    Map<Integer,Integer> map=new HashMap<>();
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i])+1,i+1};
            }
            map.put(nums[i],i);
        }
        return null;
        
    }
}