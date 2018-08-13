public void removeInRange(ArrayList<Integer> list, int value, int start, int end) {
    for (int i = start; i < end; i++) {
        if (list.get(i) == value) {
            list.remove(i);
            i--;
            end--;
        }
    }
}
