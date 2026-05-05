class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
            char[] c1 = s.toCharArray();
            char[] c2 = t.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            String a = String.valueOf(c1);
            String b = String.valueOf(c2);
        return a.equals(b);
    }
}