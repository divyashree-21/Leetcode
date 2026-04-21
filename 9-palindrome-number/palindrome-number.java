class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
         int reverseNum = 0;
         int n = x;
         while (x > 0) {
            int remainder = x % 10;
            reverseNum = (reverseNum * 10) + remainder;
            x /= 10;
        }
       return n == reverseNum;
    } 
    
}