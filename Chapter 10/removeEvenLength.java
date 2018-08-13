public void removeEvenLength(ArrayList<String> list) {
    for (int i = 0; i < list.size(); i++) {
        String word = list.get(i);
        if (word.length() % 2 == 0) {
            list.remove(i);
            i--;
        }
    }
}
