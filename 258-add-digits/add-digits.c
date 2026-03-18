int addDigits(int num) {
    while(num >= 10){
        int sum = 0;
        while(num > 0){
            int temp = num % 10;
            sum += temp;
            num /= 10;
        }
        num = sum;
    }
    return num;
    
}