public int countInRange(int[] array, int min, int max) {
    int inRange = 0;
    for (int i = 0; i < array.length; i++) {
        if (min <= array[i] && array[i] <= max) {
            inRange++;
        }
    }
    return inRange;
}
