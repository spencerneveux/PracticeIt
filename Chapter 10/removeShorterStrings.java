public void removeShorterStrings(ArrayList<String> list) {
    for (int i = 0; i < list.size() - 1; i+=2) {
        String word1 = list.get(i);
        String word2 = list.get(i+1);
        if (word1.length() < word2.length()) {
            list.remove(i);
            i--;
        }else if (word1.length() > word2.length()) {
            list.remove(i+1);
            i--;
        }else {
            list.remove(i);
            i--;
        }
    }
}
