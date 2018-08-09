public double sumTo(int n) {
    if (n < 0) {throw new IllegalArgumentException();}
    
    if (n == 0) {
        return 0.0;
    }
    
    return (1 / (double)n) + sumTo(n - 1);
}
