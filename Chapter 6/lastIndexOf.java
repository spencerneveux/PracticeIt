public int lastIndexOf(int[] array, int value) {
    int index = -1;
    for (int i = 0; i < array.length; i++) {
        if (array[i] == value) {
            index = i;
        }
    }
    return index;
}
