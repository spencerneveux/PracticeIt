public void mirror() {
    ensureCapacity(size * 2);
    for (int i = size - 1; i >= 0; i--) {
        add(elementData[i]);
    }
}
