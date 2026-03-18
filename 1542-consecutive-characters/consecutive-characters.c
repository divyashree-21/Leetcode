int maxPower(char* s) {
    int count=1,i;
    int max = 1;
    for(i = 1;s[i] != '\0';i++){
        if(s[i] == s[i-1]){
            count = count +1;
        }
        else{
            count = 1;
        }
        if(count > max){
            max = count;
        }
    }
    return max;

}