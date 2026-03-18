int minCostToMoveChips(int* position, int positionSize) {
    int even = 0,odd = 0;
    for(int i =0;i< positionSize;i++){
        if(position[i]%2 == 0){
            even++;
        }
        else{
            odd++;
        }
    }
    if(even < odd){
        return even;
    }
    else{
        return odd;
    }
    return 0;
}