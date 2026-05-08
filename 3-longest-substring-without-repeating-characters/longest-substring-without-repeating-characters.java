class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        int left = 0;
        int right = 0;
        int max = 0;
        while(right < s.length()){
            char ch = s.charAt(right);
            freq[ch]++;
            while(freq[ch] > 1){
                freq[s.charAt(left)]--;
                left++;
            }
            int len = right -left + 1;
            if(len >max){
                max = len;
            }
            right++;
        }
        return max;
    }
}