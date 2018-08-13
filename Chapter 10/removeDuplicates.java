public void removeDuplicates(ArrayList<String> list) {
    for (int i = 0; i < list.size() - 1; i++) {
        if (list.get(i+1).equals(list.get(i))) {
            list.remove(i+1);
            i--;
        }
    }
}
