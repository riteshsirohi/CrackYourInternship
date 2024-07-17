class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        ArrayList<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
            int l=j+1;
            int k=n-1;

            while(l<k){
                long sum=nums[i];
                sum+=nums[j];
                sum+=nums[k];
                sum+=nums[l];

                if(sum==target){
                  list.add(Arrays.asList(nums[i],nums[j],nums[l],nums[k]));
    
                while(l<k && nums[l]==nums[l+1]){
                    l++;
                }
                while(l<k && nums[k]==nums[k-1]){
                    k--;
                }
                l++;
                k--;
            }else if(sum<target){
                l++;
            }else{
                k--;
            }
            }
            }
        }
        return list;
    }
}