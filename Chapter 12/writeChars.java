public void writeChars(int n) {
    if (n < 1) {throw new IllegalArgumentException();}
    
    if (n == 1) {
        System.out.print("*");
        return;
    }
    
    if (n == 2) {
        writeChars(n - 1);
        System.out.print("*");
        return;
    }
    
    if (n % 2 == 0) {
        System.out.print("<");
        writeChars(n - 2);
        System.out.print(">");
        return;
    }else {
        System.out.print("<");
        writeChars(n - 2);
        System.out.print(">");
        return;
    }
}
