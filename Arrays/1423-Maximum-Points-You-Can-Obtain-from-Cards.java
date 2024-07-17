class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        int leftsum=0;
        int rightsum=0;
        int max=0;

        for(int i=0;i<k;i++){
           leftsum+=cardPoints[i];
        }
        max=leftsum;
        int rightidx = n-1;

        for(int i=k-1;i>=0;i--){
            leftsum-=cardPoints[i];
            rightsum+=cardPoints[rightidx];
            rightidx--;

            max = Math.max(max,leftsum+rightsum);
        }
        return max;
    }
}