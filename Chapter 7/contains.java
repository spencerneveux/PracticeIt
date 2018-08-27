public boolean contains(int[] a1, int[] a2) {
    for(int i = 0; i <= a1.length - a2.length; i++) {
        boolean flag = true;
        for (int j = 0; j < a2.length; j++) {
            if (a1[i+j] != a2[j]) {
                flag = false;
                break;
            }
        }
        if(flag)
            return true;
    }
    return false;
}
