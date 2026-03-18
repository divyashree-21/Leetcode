/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* runningSum(int* nums, int numsSize, int* returnSize) {
    int *rsum,i,j;
    rsum = (int*)malloc(numsSize*sizeof(int));
    rsum[0] = nums[0];
    for(i= 1,j=0;i<numsSize;i++,j++){
        rsum[j+1] = rsum[j] + nums[i];
    }
    *returnSize = numsSize;
    return rsum;
}