class Solution{
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer, Integer> num = new HashMap<>();
        int left,i;
        for(i=0;i<nums.length;i++){
            left = target - nums[i];
            if(num.containsKey(left)){
                return new int[]{num.get(left),i};
            }
            num.put(nums[i],i);
        }
        return new int[]{};
    }
}