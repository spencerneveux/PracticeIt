public void printInversions() {
    for (int i = 0; i < size; i++) {
        for (int j = i+1; j < size; j++) {
            if (elementData[i] > elementData[j])
                System.out.println("(" + elementData[i] + ", " + elementData[j] + ")");
        }
    }
}
