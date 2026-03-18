/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* buildArray(int* nums, int numsSize, int* returnSize) {
    int *lnum,i;
    lnum = (int *)malloc(numsSize*sizeof(int));
    for(i=0;i<numsSize;i++){
        lnum[i] = nums[nums[i]];
    }
    *returnSize = numsSize; 
    return lnum;

}