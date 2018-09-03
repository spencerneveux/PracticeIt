public void printPowersOf2(int n) {
   for (int i = 0; i <= n; i++) {
       int num = (int)Math.pow(2, i);
       System.out.print(num + " ");
   }
}
