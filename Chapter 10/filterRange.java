public void filterRange(ArrayList<Integer> list, int min, int max) {    
    for (int i = 0; i < list.size(); i++) {
        int value = list.get(i);
        if (min <= value && value <= max) {
            list.remove(i);
            i--;
        }
    }
}
