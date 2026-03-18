bool detectCapitalUse(char* word) {
    int i,n;
    int count = 0;
    n = strlen(word);
    for(i=0;i<n;i++){
        if(word[i]>= 65 && word[i]<=90 ){
            count ++;
        }
    }
    if(count == n || count == 0){
        return 1;
    }
    if(count == 1){
        if(word[0]>=65 && word[0] <= 90)
        {
            return 1;
        }
    }
    return 0;
}