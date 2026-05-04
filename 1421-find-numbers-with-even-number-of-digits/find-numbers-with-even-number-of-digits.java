class Solution {
    public int findNumbers(int[] nums) {
        int i,j,evencount= 0;
        for(i= 0;i<nums.length;i++){
        int count = 0;
        int n = nums[i];
        while(n>0){
            n = n/ 10;
            count += 1;
        }
        if(count%2 == 0){
            evencount += 1;
            
        }
    }
    return evencount;
    }
}