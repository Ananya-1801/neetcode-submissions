class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer,Integer> seen = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int val_need = target-nums[i];
            if(seen.containsKey(val_need))
            {
                return new int[]{seen.get(val_need),i};
            }
            else
            {
                seen.put(nums[i],i);
            }
        }    
        return new int[]{};
    }
}
