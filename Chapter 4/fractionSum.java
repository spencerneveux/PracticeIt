public double fractionSum(int n) {
    double sum = 0.0;
    for (int i = 1; i <= n; i++) {
        sum += (double)1/i;
    }
    return sum;
}
