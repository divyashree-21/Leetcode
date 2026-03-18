/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* shuffle(int* nums, int numsSize, int n, int* returnSize){
    int *arr,i;
    arr = (int*)malloc(numsSize * sizeof(int));
    arr[0] = nums[0];
    for(i = 0;i<n;i++){
        arr[2*i] = nums[i];
        arr[2*i+1] = nums[i+n];
    }
    *returnSize = numsSize;
    return arr;
}