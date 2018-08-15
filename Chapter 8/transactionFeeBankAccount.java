public boolean transactionFee(double fee) {    
    double amount = 0.0;
    for (int i = 1; i <= transactions; i++) {
        amount += fee * i;
    }
    
    if (this.balance > amount) {
        this.balance -= amount;
        return true;
    }
    
    this.balance = 0.0;
    return false;
}
