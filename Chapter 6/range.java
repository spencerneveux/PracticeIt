public static int range(int[] array) {
    int min = array[0];
    int max = array[array.length - 1];
    for (int i = 0; i < array.length; i++) {
        if (array[i] < min) {
            min = array[i];
        }else if (array[i] > max) {
            max = array[i];
        }
    }
    int difference = (max - min) + 1;
    return difference;
}
