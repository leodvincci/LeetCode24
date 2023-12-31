class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> myHash = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(myHash.containsKey(nums[i])){
                return true;
            }
            myHash.put(nums[i], myHash.getOrDefault(nums[i]+1,0));
        }

        return false;
    }
}