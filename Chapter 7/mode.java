public int mode(int[] array) {
    int[] array2 = new int[101];
    int max = 0;
    int maxKey = -1;
    
    for (int i = 0; i < array.length; i++) {
        array2[array[i]]++;
        if (array2[array[i]] > max) {
            max = array2[array[i]];
            maxKey = array[i];
        }
    }
    return maxKey;
}
