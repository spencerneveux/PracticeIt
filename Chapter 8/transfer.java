public void transfer(BankAccount other, double amount) {
    double fee = 5.0;
    
    if (balance < fee || amount <= 0) 
        return;
    
    if (balance < fee + amount) {
        other.deposit(this.balance - fee);
        this.withdraw(this.balance);
    }else {
        other.deposit(amount);
        this.withdraw(fee + amount);
    }
}
