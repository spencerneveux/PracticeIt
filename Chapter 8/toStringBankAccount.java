public String toString() {
    if (balance < 0) {
        return this.name + ", -$" + String.format("%.2f", -balance);
    }
    return this.name + ", $" + String.format("%.2f", balance);
}
