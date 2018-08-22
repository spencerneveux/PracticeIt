public double sumTo(int n) {
    if (n < 0) {throw new IllegalArgumentException();}
    
    if (n == 0) {
        return 0.0;
    }
    
    return (double)1.0/n + sumTo(n-1);
}
