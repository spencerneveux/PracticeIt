public int longestSortedSequence(int[] a) {
    if (a.length == 0) {return 0;}
    
    int count = 1;
    int longestCount = 1;
    for (int i = 0; i < a.length - 1; i++) {
        if (a[i] <= a[i + 1]) {
            count++;
        }
        
        if (a[i] > a[i+1]) {
            longestCount = count;
            count = 1;
        }else {
            longestCount = count;
        }
    }
    return longestCount;
}
