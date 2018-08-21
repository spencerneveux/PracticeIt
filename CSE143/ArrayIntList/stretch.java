public void stretch(int n) {
    if (n <= 0) {clear();}
    
    int oldSize = size;
    ensureCapacity(size*n);
    for (int i = 0; i < oldSize; i++) {
        for (int j = 1; j < n; j++) {
            add(n * i + j, elementData[n * i]);
        }
    }
}
