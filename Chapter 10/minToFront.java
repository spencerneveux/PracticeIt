public void minToFront(ArrayList<Integer> list) {
    int minValue = list.get(0);
    int index = 0;
    
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) < minValue) {
            minValue = list.get(i);
            index = i;
        }
    }
    
    list.remove(index);
    list.add(0, minValue);
}
