class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    ArrayList<List<Integer>> list  = new ArrayList<>();

    Arrays.sort(nums);
    int n=nums.length;
    int sum=0;

    for(int i=0;i<n-2;i++){
        if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
        int j=i+1;
        int k=n-1;

        while(j<k){
            sum=nums[i]+nums[j]+nums[k];
            if(sum==0){
              list.add(Arrays.asList(nums[i],nums[j],nums[k]));
               while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
            j++;
            k--;
        }else if(sum<0){
            j++;
        }else{
            k--;
        }
    }
    }
    return list;
}
}