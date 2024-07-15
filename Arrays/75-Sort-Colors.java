class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;

        for(int i:nums){
            if(i==0){
                zero++;
            }else if(i==1){
                one++;
            }else if(i==2){
                two++;
            }
        }
        for(int i=0;i<zero;i++){
            nums[i]=0;
        }
        for(int i=zero;i<one+zero;i++){
            nums[i]=1;
        }
        for(int i=one+zero;i<zero+one+two;i++){
            nums[i]=2;
        }
    }
}