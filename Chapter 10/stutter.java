public void stutter(ArrayList<String> list, int k) {
    List<String> tempList = new ArrayList<>();
    
    for (String word : list) {
        for (int i = 0; i < k; i++) {
            tempList.add(word);
        }
    }
    
    list.clear();
    
    for (String word : tempList) {
        list.add(word);
    }
}
