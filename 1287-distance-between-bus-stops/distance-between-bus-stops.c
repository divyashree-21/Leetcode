

int distanceBetweenBusStops(int* distance, int distanceSize, int start, int destination){
    if(start > destination){
        int temp = start;
        start = destination;
        destination = temp;
    }
    int total = 0;
    int forward = 0;
    for(int i = 0;i< distanceSize;i++){
        total += distance[i];
        if(i >= start && i<destination){
            forward += distance[i];
        }
    }
    int backward = total - forward;
    if(forward < backward){
        return forward;
    }
    return backward;

}