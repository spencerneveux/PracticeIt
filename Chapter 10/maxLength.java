public int maxLength(ArrayList<String> list) {
    if (list.size() < 1) {return 0;}
    int max = list.get(0).length();
    for (int i = 0; i < list.size(); i++) {
        String word = list.get(i);
        if (word.length() > max) {
            max = word.length();
        }
    }
    return max;
}
