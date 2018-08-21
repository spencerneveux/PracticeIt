public int maxCount() {
    if (size == 0) {return 0;}
   
    int maxCount = 1;
    for (int i = 0; i < size - 1; i++) {
        if (elementData[i] == elementData[i+1]) {
            int index = i; 
            int count = 0;
            while(elementData[i] == elementData[index]){
                count++;
                index++;
            }
            if (count > maxCount)
                maxCount = count;
        }
    }
    return maxCount;
}
