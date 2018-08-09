public boolean isUnique(int[] a) {
    if (a.length <= 1) {return true;}
    
    for (int i = 0; i < a.length; i++) {
        for (int j = i + 1; j < a.length; j++) {
            if (a[i] == a[j]) {
                return false;
            }
        }
    }
    return true;
}
