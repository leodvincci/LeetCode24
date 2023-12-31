class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> myHash = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(myHash.containsKey(target-nums[i])){
                return new int[]{i,myHash.get(target-nums[i])};
            }else{
                myHash.put(nums[i], i);
            }

        }
                    return null;

    }
}