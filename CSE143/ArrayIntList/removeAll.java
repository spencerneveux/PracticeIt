public void removeAll(int value) {
    for (int i = 0; i < size; i++) {
        if (elementData[i] == value) {
            remove(i);
            i--;
        }
    }
}
