public int kthLargest(int k, int[] a) {
    // Sort the array
    for (int i = 0; i < a.length; i++) {
        for (int j = i + 1; j < a.length; j++) {
            if (a[i] > a[j]) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    int element = a[a.length - 1];
    for (int x = a.length - 1; x >= a.length - 1 - k; x--) {
        element = a[x];
    }
    return element;
}
