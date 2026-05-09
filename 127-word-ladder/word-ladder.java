class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        boolean[] visited = new boolean[wordList.size()];
        String[] queue = new String[10000];
        int front = 0;
        int rear = 0;
        queue[rear] = beginWord;
        rear++;
        int steps = 1;
        while(front < rear){
            int size = rear - front;
            for(int s = 0;s<size;s++){
                String current = queue[front];
                front++;
                if(isSame(current,endWord)){
                    return steps;
                }
                for(int i = 0;i< wordList.size();i++){
                    if(!visited[i] && oneLetter(current,wordList.get(i))){
                        queue[rear] = wordList.get(i);
                        rear++;
                        visited[i] = true;
                    }
                }
            }
            steps++;
        }
        return 0;
    }
    public boolean oneLetter(String a,String b){
        int count = 0;
        for(int i = 0;i< a.length();i++){
            if(a.charAt(i) != b.charAt(i))
            count++;
        }
    
    return count == 1;
    }
    public boolean isSame(String a,String b){
        if(a.length() != b.length()){
            return false;
        }
        for(int i = 0;i< a.length();i++){
            if(a.charAt(i) != b.charAt(i)){
                return false;
            }
        }
        return true;
    }
}