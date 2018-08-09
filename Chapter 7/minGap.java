public int minGap(int[] a) {
    if (a.length < 2) {return 0;}
    
    int minGap = a[1] - a[0];
    for (int i = 0; i < a.length - 1; i++) {
        if(a[i+1] - a[i] < minGap) {
            minGap = a[i+1] - a[i];
        }
    }
    return minGap;
}
