public void doubleList(ArrayList<String> list) {
    int size = list.size();
    for (int i = 0; i < size; i++) {
        String word = list.get(2 * i);
        list.add(2 * i + 1, word);
    }
}
