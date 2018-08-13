public void doubleList(ArrayList<String> list) {
    List<String> newList = new ArrayList<>();
    
    for (String words : list) {
        newList.add(words);
        newList.add(words);
    }
    
    list.clear();
    
    for (String words : newList) {
        list.add(words);
    }   
}
