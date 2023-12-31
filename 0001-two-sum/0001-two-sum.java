class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];
        HashMap<Integer,Integer> myHash = new HashMap<>();

        for(int i=0; i < nums.length; i++){
            if(myHash.containsKey(target - nums[i] )){
                res[0] = i;
                res[1] = myHash.get(target - nums[i]);
            }else{
                myHash.put(nums[i],i);
            }
        }

        return res;
        
    }
}