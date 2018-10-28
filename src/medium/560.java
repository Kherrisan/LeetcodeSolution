class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int cnt=0;
        Map<Integer,Integer> preSum=new HashMap();
        preSum.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(preSum.containsKey(sum-k)){
                cnt+=preSum.get(sum-k);
            }
            preSum.put(sum,preSum.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}