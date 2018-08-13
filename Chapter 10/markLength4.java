public void markLength4(ArrayList<String> list) {
    for (int i = 0; i < list.size(); i++) {
        String word = list.get(i);
        if (word.length() == 4) {
            list.add(i, "****");
            i++;
        }
    }
}
