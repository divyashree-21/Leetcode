class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;

        int[] result = new int[n - k + 1];

        int[] deque = new int[n];

        int front = 0;
        int rear = 0;

        int index = 0;

        for (int i = 0; i < n; i++) {

            while (front < rear && deque[front] <= i - k) {
                front++;
            }

            while (front < rear &&
                   nums[deque[rear - 1]] < nums[i]) {

                rear--;
            }

            deque[rear] = i;
            rear++;

            if (i >= k - 1) {

                result[index] = nums[deque[front]];
                index++;
            }
        }

        return result;
    }
}