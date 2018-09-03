public void printPowersOfN(int base, int exp) {
    for (int i = 0; i <= exp; i++) {
        int num = (int)Math.pow(base, i);
        System.out.print(num + " ");
    }
}
